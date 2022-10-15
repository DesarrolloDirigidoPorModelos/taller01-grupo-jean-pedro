package org.example.municipio;

public class Cliente {
    String ndi;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String correoElectronico;
    //list of medidores
    Medidor[] medidores;


    public Cliente(String ndi, String nombres, String apellidos, String direccion, String telefono, String correoElectronico, Medidor[] medidores) {
        this.ndi = ndi;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.medidores = medidores;
    }

    public Medidor[] getMedidores() {
        return medidores;
    }

    public void setMedidores(Medidor[] medidores) {
        this.medidores = medidores;
    }

    public String getNdi() {
        return ndi;
    }

    public void setNdi(String ndi) {
        this.ndi = ndi;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "ndi='" + ndi + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                '}';
    }

    //buy medidor
    public void comprarMedidor(Medidor medidor){
        //add medidor to list
        Medidor[] newMedidores = new Medidor[medidores.length + 1];
        for (int i = 0; i < medidores.length; i++) {
            newMedidores[i] = medidores[i];
        }
        newMedidores[newMedidores.length - 1] = medidor;
        medidores = newMedidores;
        //print buy
        System.out.println("Medidor comprado: " + medidor);

    }
}
