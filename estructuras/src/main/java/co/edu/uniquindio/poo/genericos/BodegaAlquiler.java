package co.edu.uniquindio.poo.genericos;

import co.edu.uniquindio.poo.carrito.Producto;

import java.util.ArrayList;

public class BodegaAlquiler {

    private String codigo;
    private ArrayList<Mueble> listaProductos;
    private int capacidad;


    public BodegaAlquiler() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Mueble> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(ArrayList<Mueble> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
