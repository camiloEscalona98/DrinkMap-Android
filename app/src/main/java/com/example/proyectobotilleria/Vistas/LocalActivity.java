package com.example.proyectobotilleria.Vistas;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;

import com.example.proyectobotilleria.InfoFragment;
import com.example.proyectobotilleria.R;
import com.example.proyectobotilleria.fragments.Configuracion_Fragment;
import com.example.proyectobotilleria.fragments.Mensajes_Fragment;
import com.example.proyectobotilleria.fragments.Modificar_Fragment;
import com.example.proyectobotilleria.fragments.Promociones_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class LocalActivity extends AppCompatActivity implements Mensajes_Fragment.OnFragmentInteractionListener,Modificar_Fragment.OnFragmentInteractionListener,Configuracion_Fragment.OnFragmentInteractionListener,Promociones_Fragment.OnFragmentInteractionListener   {

    private BottomNavigationView bottomNavigationView;
    private Configuracion_Fragment configuracion_fragment;
    private Mensajes_Fragment mensajes_fragment;
    private Modificar_Fragment modificar_fragment;
    private Promociones_Fragment promociones_fragment;
    private FrameLayout contenedor_fragment;

    TextView txvConexion;
    Switch switchC;
    InfoFragment infoFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_local);
        getSupportActionBar().hide();
        txvConexion = (TextView) findViewById(R.id.txv_conexion);
        switchC = (Switch) findViewById(R.id.swt_conexion);


        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavigationView);



        final Configuracion_Fragment configuracion_fragment = new Configuracion_Fragment();
        final Mensajes_Fragment mensajes_fragment = new Mensajes_Fragment();
        final Modificar_Fragment modificar_fragment = new Modificar_Fragment();
        final Promociones_Fragment promociones_fragment = new Promociones_Fragment();

        contenedor_fragment = findViewById(R.id.contenedor_fragment);

        setFragment(promociones_fragment);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId())
                {
                    case R.id.item_promociones:
                    setFragment(promociones_fragment);
                    return true;
                    case R.id.item_modificar:
                        setFragment(modificar_fragment);
                        return true;
                    case R.id.item_mensajes:
                        setFragment(mensajes_fragment);
                        return true;
                    case R.id.item_configuracion:
                        setFragment(configuracion_fragment);
                        return true;

                }
                return false;
            }
        });





    }

    private void setFragment(Fragment fragment) {
        FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
        transaction1.replace(R.id.contenedor_fragment, fragment);
        transaction1.commit();

    }


    public void onclick(View view) {
        if (view.getId() == R.id.swt_conexion) {
            if (switchC.isChecked()) {
                txvConexion.setText(R.string.conectado);
            } else {
                txvConexion.setText(R.string.desconectado);
            }
        }

        switch (view.getId())
        {
            case R.id.item_promociones:
                InfoFragment infoFragment = new InfoFragment();
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                transaction1.replace(R.id.contenedor_fragment, infoFragment);
                transaction1.commit();
                break;
            case R.id.item_modificar:
                Modificar_Fragment modificar_fragment = new Modificar_Fragment();
                FragmentTransaction transaction2 = getSupportFragmentManager().beginTransaction();
                transaction2.replace(R.id.contenedor_fragment, modificar_fragment);
                transaction2.commit();
                break;
            case R.id.item_mensajes:
                Mensajes_Fragment mensajes_fragment = new Mensajes_Fragment();
                FragmentTransaction transaction3 = getSupportFragmentManager().beginTransaction();
                transaction3.replace(R.id.contenedor_fragment, mensajes_fragment);
                transaction3.commit();
                break;
            case R.id.item_configuracion:
                Configuracion_Fragment configuracion_fragment = new Configuracion_Fragment();
                FragmentTransaction transaction4 = getSupportFragmentManager().beginTransaction();
                transaction4.replace(R.id.contenedor_fragment, configuracion_fragment);
                transaction4.commit();
                break;

        }

    }


    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}





















