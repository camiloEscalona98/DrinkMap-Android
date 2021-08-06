package com.example.proyectobotilleria.InicioSesion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.proyectobotilleria.R;
import com.example.proyectobotilleria.Registros.RegistrarLocal;
import com.example.proyectobotilleria.Vistas.LocalActivity;

public class InicioLocalActivity extends AppCompatActivity {

    EditText edtCorreo;
    EditText edtContraseña;
    Button btnIngresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_local);
        vincularElementos();
        getSupportActionBar().hide();
    }

    private void vincularElementos() {

        edtCorreo = (EditText) findViewById(R.id.edt_correo);
        edtContraseña = (EditText) findViewById(R.id.edt_contraseña);
        btnIngresar = (Button) findViewById(R.id.btn_ingresar);


    }
    public void iniciarSesion(View view)
    {
        Intent intent = new Intent(getApplicationContext(), LocalActivity.class);
        startActivity(intent);
    }
    public void registrar(View view)
    {
        Intent intent = new Intent(getApplicationContext(), RegistrarLocal.class);
        startActivity(intent);
    }

}
