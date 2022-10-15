package org.example;

import org.example.municipio.Cliente;
import org.example.municipio.Medidor;

public class Main {
    public static void main(String[] args) {
        //register medidor
        Medidor medidor = new Medidor("123456", "Precision Medidor", "ubicacion", 200);
        // register client
        Cliente cliente = new Cliente("123456", "Juan", "Perez", "Calle 1", "23453", "aaa@mail.com");
        //buy medidor
        cliente.comprarMedidor(medidor);
    }
}