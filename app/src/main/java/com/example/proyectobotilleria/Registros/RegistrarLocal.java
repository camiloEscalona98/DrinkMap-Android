package com.example.proyectobotilleria.Registros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.example.proyectobotilleria.MapsUbicacionActivity;
import com.example.proyectobotilleria.R;


public class RegistrarLocal extends AppCompatActivity {

    EditText nombre_local;
    EditText numero;
    EditText correo;
    EditText direccion;
    EditText contraseña;
    EditText repetir_contraseña;
    ImageButton fotoLocal;
    ImageButton gpsLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_local);
        getSupportActionBar().hide();
      //  vincularElementos();
    }

    public void gpslocal (View view)
    {
        Intent intent = new Intent(getApplicationContext(), MapsUbicacionActivity.class);
        startActivity(intent);
    }
    public void camara (View view)
    {
        StrictMode.VmPolicy.Builder builder = new StrictMode.VmPolicy.Builder();
        StrictMode.setVmPolicy(builder.build());
        Intent intent = new Intent(getApplicationContext(), CamaraActivity.class);
        startActivity(intent);
    }


    private void vincularElementos() {

        nombre_local = (EditText) findViewById(R.id.edt_nombre_local);
        numero = (EditText) findViewById(R.id.edt_numero_telefonico);
        correo = (EditText) findViewById(R.id.edt_correo_electronico);
        direccion = (EditText) findViewById(R.id.edt_direccion);
        contraseña = (EditText) findViewById(R.id.edt_contraseña_local);
        repetir_contraseña = (EditText) findViewById(R.id.edt_repetir_contraseña_local);
        fotoLocal = (ImageButton) findViewById(R.id.ibtm_foto_local);
        gpsLocal = (ImageButton) findViewById(R.id.ibtn_gps_local);


    }
}
