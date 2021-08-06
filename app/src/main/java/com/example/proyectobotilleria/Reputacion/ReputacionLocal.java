package com.example.proyectobotilleria.Reputacion;

public class ReputacionLocal {

    private String nombre, comentario;
    private int valoracion;

    public ReputacionLocal(String nombre, String comentario, int valoracion) {
        this.nombre = nombre;
        this.comentario = comentario;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }


}
