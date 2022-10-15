package org.example;

import org.example.municipio.Cliente;
import org.example.municipio.Medidor;

/**
 * MODELO
 * https://cruise.umple.org/umpleonline/umple.php?model=221015rfamxzfurkvt
 */
public class Main {
    public static void main(String[] args) {
        //test classes Cliente
        Cliente cliente = new Cliente("123456789", "Juan", "Perez", "123456789", "", "");
        //create obj medidor
        Medidor medidor = new Medidor("123456789", "Marca", "Ubicacion", 200.0, cliente);
        System.out.println("Numero de medidores:"+cliente.numberOfMedidors());
        Medidor medidor2 = new Medidor("1234567891", "Marca", "Ubicacion", 100.0);
        //add medidor to cliente
        System.out.println("Se agrega medidor:"+medidor2.hashCode());
        cliente.addMedidor(medidor2);
        //print numbers of medidor
        System.out.println("Numero de medidores:"+cliente.numberOfMedidors());





    }
}