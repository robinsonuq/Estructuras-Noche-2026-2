package co.edu.uniquindio.poo.listas.listasimple;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        //users java
        LinkedList<Integer> lista = new LinkedList<>();
        lista.add(5);
        Integer i = lista.get(0);


        ListaEnlazadaSimple listaEnlazadaSimple = new ListaEnlazadaSimple();
        listaEnlazadaSimple.addFirst(4);
        listaEnlazadaSimple.addFirst(5);
        listaEnlazadaSimple.addFirst(6);
        listaEnlazadaSimple.addFirst(7);
        listaEnlazadaSimple.addFirst(8);

        //listaEnlazadaSimple.imprimir();

        listaEnlazadaSimple.imprimir3();

        listaEnlazadaSimple.addLast();

    }
}
