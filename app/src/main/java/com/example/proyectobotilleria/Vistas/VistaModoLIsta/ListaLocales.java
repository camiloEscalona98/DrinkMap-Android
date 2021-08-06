package com.example.proyectobotilleria.Vistas.VistaModoLIsta;

public class ListaLocales {

    String txv_nombreLocal;
    String txv_distanciaLocal;
    int img_fotoLocal;

    public int getImg_disponibilidad() {
        return img_disponibilidad;
    }

    public void setImg_disponibilidad(int img_disponibilidad) {
        this.img_disponibilidad = img_disponibilidad;
    }


    int img_disponibilidad;



    public String getTxv_nombreLocal() {
        return txv_nombreLocal;
    }

    public void setTxv_nombreLocal(String txv_nombreLocal) {
        this.txv_nombreLocal = txv_nombreLocal;
    }

    public String getTxv_distanciaLocal() {
        return txv_distanciaLocal;
    }

    public void setTxv_distanciaLocal(String txv_distanciaLocal) {
        this.txv_distanciaLocal = txv_distanciaLocal;
    }

    public int getImg_fotoLocal() {
        return img_fotoLocal;
    }

    public void setImg_fotoLocal(int img_fotoLocal) {
        this.img_fotoLocal = img_fotoLocal;
    }



    public ListaLocales(String txv_nombreLocal, String txv_distanciaLocal, int img_fotoLocal, int img_disponibilidad) {
        this.txv_nombreLocal = txv_nombreLocal;
        this.txv_distanciaLocal = txv_distanciaLocal;
        this.img_fotoLocal = img_fotoLocal;
        this.img_disponibilidad = img_disponibilidad;
    }


}
