package co.edu.uniquindio.poo.collections;

import java.util.*;

public class Conjuntos {

    public static void main(String[] args) {


        Set<Cliente> listadoClientes = new HashSet<>();

        Cliente c1 = new Cliente("Juan","1",23);
        Cliente c2 = new Cliente("Luis","2",30);
        Cliente c3 = new Cliente("Pedro","3",18);

        boolean a = listadoClientes.add(c1);
        boolean b = listadoClientes.add(c2);


        LinkedHashSet<Cliente> listaClientesBanco = new LinkedHashSet<>();

        listaClientesBanco.add(c1);
        listaClientesBanco.add(c2);
        listaClientesBanco.add(c3);

        Cliente c4 = new Cliente("Chucho","10384",60);

        //listaClientesBanco.addFirst(c4);
        listaClientesBanco.addLast(c4);
        listaClientesBanco.removeFirst();


        TreeSet<Cliente> clientes = new TreeSet<>(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente o1, Cliente o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);

        clientes.first();
        clientes.last();


        for (Cliente cliente : clientes){
            System.out.println(cliente.getNombre());
        }



        // usar el hashset CRUD con el String
    }
}
