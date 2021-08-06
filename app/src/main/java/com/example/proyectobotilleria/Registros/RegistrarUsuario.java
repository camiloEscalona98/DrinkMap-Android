package com.example.proyectobotilleria.Registros;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.proyectobotilleria.R;


public class RegistrarUsuario extends AppCompatActivity {

    EditText nombres;
    EditText apellidos;

    public EditText getNombres() {
        return nombres;
    }

    public void setNombres(EditText nombres) {
        this.nombres = nombres;
    }

    public EditText getApellidos() {
        return apellidos;
    }

    public void setApellidos(EditText apellidos) {
        this.apellidos = apellidos;
    }

    public EditText getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(EditText nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public EditText getCorreo() {
        return correo;
    }

    public void setCorreo(EditText correo) {
        this.correo = correo;
    }

    public EditText getContraseña() {
        return contraseña;
    }

    public void setContraseña(EditText contraseña) {
        this.contraseña = contraseña;
    }

    public EditText getRepetir_contraseña() {
        return repetir_contraseña;
    }

    public void setRepetir_contraseña(EditText repetir_contraseña) {
        this.repetir_contraseña = repetir_contraseña;
    }

    EditText nombre_usuario;


    EditText correo;
    EditText contraseña;
    EditText repetir_contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_usuario);
        getSupportActionBar().hide();
        //vincularElementos();

    }

    private void vincularElementos() {
        nombres = (EditText) findViewById(R.id.edt_nombres);
        apellidos = (EditText) findViewById(R.id.edt_apellidos);
        nombre_usuario = (EditText) findViewById(R.id.edt_nombre_usuario);
        correo = (EditText) findViewById(R.id.edt_correo);
        contraseña = (EditText) findViewById(R.id.edt_contraseña);
        repetir_contraseña = (EditText) findViewById(R.id.edt_repetir_contraseña);
    }
}