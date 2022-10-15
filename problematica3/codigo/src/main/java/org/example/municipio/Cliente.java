package org.example.municipio;

public class Cliente {
    String ndi;
    String nombres;
    String apellidos;
    String direccion;
    String telefono;
    String correoElectronico;


    public Cliente(String ndi, String nombres, String apellidos, String direccion, String telefono, String correoElectronico) {
        this.ndi = ndi;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
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
        System.out.println("El cliente "+this.nombres+" ha comprado el medidor "+medidor.getCodigo());
    }
}
