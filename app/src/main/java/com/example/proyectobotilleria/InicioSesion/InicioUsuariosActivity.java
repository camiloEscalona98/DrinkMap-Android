package com.example.proyectobotilleria.InicioSesion;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ProgressBar;

import com.example.proyectobotilleria.R;
import com.example.proyectobotilleria.Registros.RegistrarUsuario;
import com.example.proyectobotilleria.mapaActivity;
import com.google.firebase.auth.FirebaseAuth;

public class InicioUsuariosActivity extends AppCompatActivity {

    EditText correo;
    EditText contraseña;
    Button btnIniciar;
    CheckedTextView btnRegistrar;
    private ProgressDialog progresesDialog;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_usuarios);

        firebaseAuth = FirebaseAuth.getInstance();
        progresesDialog = new ProgressDialog(this);
        getSupportActionBar().hide();
        vincularElementos();
    }
    public void iniciar (View view)
    {
        Intent intent = new Intent(this, mapaActivity.class);
        startActivity(intent);
    }
    public void registrar (View view)
    {
        Intent intent = new Intent(this, RegistrarUsuario.class);
        startActivity(intent);
    }

    private void vincularElementos() {
        correo = (EditText) findViewById(R.id.edt_correo);
        contraseña = (EditText) findViewById(R.id.edt_contraseña);
        btnIniciar = (Button) findViewById(R.id.btn_iniciar);
        btnRegistrar = (CheckedTextView) findViewById(R.id.btn_registrar);

    }


}
