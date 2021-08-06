package com.example.proyectobotilleria.ConfiguracionUsuario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckedTextView;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.proyectobotilleria.InicioSesion.InicioUsuariosActivity;
import com.example.proyectobotilleria.R;

public class ConUsuarioActivity extends AppCompatActivity {

    private CheckedTextView btn_cerrarSesion;
    private ImageButton btn_miCuenta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_con_usuario);
        getSupportActionBar().hide();
        btn_cerrarSesion = (CheckedTextView) findViewById(R.id.btn_cerrarSesion_usuario);
        btn_cerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), InicioUsuariosActivity.class);
                startActivity(intent);
            }
        });

        btn_miCuenta = (ImageButton) findViewById(R.id.btn_mi_cuenta);
        btn_miCuenta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ConCuentaUsuarioActivity.class);
                startActivity(intent);
            }
        });


    }




}
