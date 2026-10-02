package co.edu.uniquindio.poo.carrito;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        Carrito<Producto> carrito = new Carrito<Producto>("C2");
        carrito.agregar(new Fruta("Manzana",234));
        carrito.agregar(new Moto("Pera",4456));

        CarritoIterator<Producto> carritoIterator = carrito.iterator();

        for (Producto producto = carritoIterator.next(); carritoIterator.hasNext();carritoIterator.next()){

        }
       while(carritoIterator.hasNext()){
           Producto producto = carritoIterator.next();
       }
        while(carritoIterator.hasNextSalto()){
            Producto producto = carritoIterator.saltarNext();
        }



    }
}
