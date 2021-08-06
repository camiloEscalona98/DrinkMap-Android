package com.example.proyectobotilleria.PromocionesVistaUsuario;

public class PromocionesUsuario {

    private String valorPromocion, descripcionPromocion;
    private int fotoPromocion;

    public PromocionesUsuario() {
    }

    public String getValorPromocion() {
        return valorPromocion;
    }

    public void setValorPromocion(String valorPromocion) {
        this.valorPromocion = valorPromocion;
    }

    public String getDescripcionPromocion() {
        return descripcionPromocion;
    }

    public void setDescripcionPromocion(String descripcionPromocion) {
        this.descripcionPromocion = descripcionPromocion;
    }

    public int getFotoPromocion() {
        return fotoPromocion;
    }

    public void setFotoPromocion(int fotoPromocion) {
        this.fotoPromocion = fotoPromocion;
    }

    public PromocionesUsuario(String valorPromocion, String descripcionPromocion, int fotoPromocion) {
        this.valorPromocion = valorPromocion;
        this.descripcionPromocion = descripcionPromocion;
        this.fotoPromocion = fotoPromocion;
    }




}
