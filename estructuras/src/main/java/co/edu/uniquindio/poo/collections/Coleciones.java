package co.edu.uniquindio.poo.collections;

import java.util.*;

public class Coleciones {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>(100);

        lista.add("ana");
        lista.add("alberto");
        lista.add("robinson");
        lista.add("carlos");
        lista.add("andrea");
        lista.add("pedro");
        lista.add("luis");
        lista.add("alberto");
        lista.add("robinson");
        lista.add("carlos");
        lista.add("andrea");
        lista.add("pedro");
        //desarrollar un metodo que elimine los estudiantes que empiecen por la letra a

       LinkedList<String> linkedList = new LinkedList<>();

        eliminar(linkedList,"a");
        eliminar(lista,"a");

        System.out.println();
    }

    private static void eliminar(ArrayList<String> lista,String letra) {

       ListIterator<String> listIterator = lista.listIterator();
        while(listIterator.hasNext()){
            if (listIterator.next().startsWith(letra)) listIterator.remove();
        }

    }
    private static void eliminar(LinkedList<String> lista,String letra) {

        ListIterator<String> listIterator = lista.listIterator();
        while(listIterator.hasNext()){
            if (listIterator.next().startsWith(letra)) listIterator.remove();
        }

    }
    private static void eliminar(List<String> lista,String letra) {

        ListIterator<String> listIterator = lista.listIterator();
        while(listIterator.hasNext()){
            if (listIterator.next().startsWith(letra)) listIterator.remove();
        }

    }
    private static void eliminar2(ArrayList<String> lista,String letra) {
        lista.removeIf(aux -> aux.startsWith(letra));
    }


}
