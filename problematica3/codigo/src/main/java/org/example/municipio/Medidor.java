package org.example.municipio;

public class Medidor {
    String codigo;
    String marca;
    String ubicacion;
    double costo;

    public Medidor(String codigo, String marca, String ubicacion, double costo) {
        this.codigo = codigo;
        this.marca = marca;
        this.ubicacion = ubicacion;
        this.costo = costo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
