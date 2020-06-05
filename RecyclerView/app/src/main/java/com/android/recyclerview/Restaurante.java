package com.android.recyclerview;

public class Restaurante {
    private String nombre;
    private String url;
    private float valoracion;
    private String direccion;

    public Restaurante(String nombre, String url, float valoracion, String direccion) {
        this.nombre = nombre;
        this.url = url;
        this.valoracion = valoracion;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public float getValoracion() {
        return valoracion;
    }

    public void setValoracion(float valoracion) {
        this.valoracion = valoracion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


}
