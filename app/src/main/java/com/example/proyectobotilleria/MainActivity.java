package com.example.proyectobotilleria;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.ImageButton;

import com.example.proyectobotilleria.InicioSesion.InicioLocalActivity;
import com.example.proyectobotilleria.InicioSesion.InicioUsuariosActivity;
import com.example.proyectobotilleria.Registros.RegistrarLocal;
import com.example.proyectobotilleria.Registros.RegistrarUsuario;


public class MainActivity extends AppCompatActivity {

    ImageButton btnUsuario;
    ImageButton btnLocal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vincularElementos();
        getSupportActionBar().hide();

    }

    private void vincularElementos() {

        btnUsuario = (ImageButton) findViewById(R.id.btn_usuario);
        btnLocal = (ImageButton) findViewById(R.id.btn_local);

    }
    public void btnUsuario(View view)
    {
        Intent intent = new Intent(getApplicationContext(), InicioUsuariosActivity.class);
        startActivity(intent);
    }
    public void btnLocal(View view )
    {
        Intent intent = new Intent(getApplicationContext(), InicioLocalActivity.class);
        startActivity(intent);
    }



}
