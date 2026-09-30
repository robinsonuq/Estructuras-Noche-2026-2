package co.edu.uniquindio.poo.genericos;

import java.util.ArrayList;

public class Genericos {

    public static void main(String[] args) {
        //infraestructura
       // usted creo una clase que la va a usar otra persona del proyecto

        Bodega<Producto> bodega1 = new Bodega<>();
        bodega1.guardar(new Carro());
        bodega1.guardar(new Carro());
        bodega1.guardar(new Carro());
        bodega1.guardar(new Carro());

        bodega1.sacar(0);

       // contexto especifico contable

    }


    private static class Carro {


    }
}
