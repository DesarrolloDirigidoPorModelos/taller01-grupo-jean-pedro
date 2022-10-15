package org.example;

import org.example.municipio.Cliente;
import org.example.municipio.Medidor;

public class Main {
    public static void main(String[] args) {
        //register medidor
        Medidor medidor = new Medidor("123456", "Precision Medidor", "ubicacion", 200);
        //Medidor 2
        Medidor medidor2 = new Medidor("123456", "Precision Medidor", "ubicacion1", 200);
        // register cliente
        Cliente cliente = new Cliente("123456", "Juan", "Perez", "Calle 123", "123456", "mail@demo.com");
        //buy medidor
        cliente.comprarMedidor(medidor);
        System.out.println("El cliente tiene " + cliente.getMedidores().length + " medidores");
        //buy medidor 2
        cliente.comprarMedidor(medidor2);
        System.out.println("El cliente tiene " + cliente.getMedidores().length + " medidores");
    }
}