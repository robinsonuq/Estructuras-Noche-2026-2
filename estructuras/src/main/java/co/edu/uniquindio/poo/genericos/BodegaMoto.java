package co.edu.uniquindio.poo.genericos;

import java.util.ArrayList;

public class BodegaMoto {

    private String codigo;
    private ArrayList<Moto> listaProductos;
    private int capacidad;

    public BodegaMoto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
