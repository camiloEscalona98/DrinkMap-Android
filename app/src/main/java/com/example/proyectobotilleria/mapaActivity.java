package com.example.proyectobotilleria;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import com.example.proyectobotilleria.ConfiguracionLocal.ConCuentaActivity;
import com.example.proyectobotilleria.ConfiguracionUsuario.ConUsuarioActivity;
import com.example.proyectobotilleria.Registros.RegistrarUsuario;
import com.example.proyectobotilleria.Vistas.VistaModoLIsta.VistaListaLocalesActivity;
import com.example.proyectobotilleria.fragments.ReputacionFragment;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.location.zzas;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;

public class mapaActivity extends FragmentActivity implements OnMapReadyCallback, GoogleMap.OnMarkerClickListener, LocationListener {
    private LocationManager ubicacion;
    private static final String TAG = mapaActivity.class.getName();
    private GoogleMap mMap;

    private FrameLayout contenedor_fragmentInfo;
    double latitud;
    double longitud;
    Location location;
    boolean gpsActivo;
    LocationManager locationManager;
    ImageButton btnLista;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapa);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);


        contenedor_fragmentInfo = findViewById(R.id.contenedor_fragment_info);
        InfoFragment infoFragment = new InfoFragment();

        btnLista = (ImageButton) findViewById(R.id.btn_vista_lista);




    }




    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        // Add a marker in Sydney and move the camera
        LatLng Temuco = new LatLng(-38.7362442, -72.5905979);
        mMap.addMarker(new MarkerOptions().position(Temuco).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.iconoverde)));
        LatLng Casa = new LatLng(-38.7380301, -72.6472868);
        mMap.addMarker(new MarkerOptions().position(Casa).draggable(false).icon(BitmapDescriptorFactory.fromResource(R.drawable.iconorojo)));

        mMap.setOnMarkerClickListener(this);
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        
        ubicacion();
        LatLng UbicacionActual = new LatLng(latitud, longitud);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(UbicacionActual,13));




    }
    @RequiresApi(api = Build.VERSION_CODES.M)
    private void ubicacion()
    {
        try {

            locationManager = (LocationManager )this.getSystemService(LOCATION_SERVICE);
            gpsActivo = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);

        }catch (Exception e){}

        if (gpsActivo) {
            if (checkSelfPermission(Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && checkSelfPermission(Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {

                return;
            }
            locationManager.requestLocationUpdates(locationManager.GPS_PROVIDER
                    , 1000 * 60
                    , 10
                    , this);

            location = locationManager.getLastKnownLocation(locationManager.GPS_PROVIDER);
            latitud =  location.getLatitude();
            longitud = location.getLongitude();

        }

    }


    @Override
    public boolean onMarkerClick(Marker marker) {
        final InfoFragment infoFragment = new InfoFragment();
        contenedor_fragmentInfo = findViewById(R.id.contenedor_fragment_info);
        setFragment(infoFragment);
        return false;
    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.contenedor_fragment_info, fragment);
        transaction1.commit();


    }


    @Override
    public void onLocationChanged(Location location) {

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
    public void vistaModoLista(View view)
    {
        Intent intent = new Intent(getApplicationContext(), VistaListaLocalesActivity.class);
        startActivity(intent);
    }
    public void configuracionUsuario(View view)
    {
        Intent intent = new Intent(getApplicationContext(), ConUsuarioActivity.class);
        startActivity(intent);
    }




}
