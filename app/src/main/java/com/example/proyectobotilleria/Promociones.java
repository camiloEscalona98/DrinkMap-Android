package com.example.proyectobotilleria;

public class Promociones {
    private String descripcion;
    private String valor;
    private int foto;

    public Promociones(String descripcion, String valor, int foto) {
        this.descripcion = descripcion;
        this.valor = valor;
        this.foto = foto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
