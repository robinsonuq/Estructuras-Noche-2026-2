package co.edu.uniquindio.poo.genericos;

import java.util.ArrayList;

public class Bodega<T> {

    private String codigo;
    private ArrayList<T> lista;
    private int capacidad;

    public Bodega() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<T> getListaProductos() {
        return lista;
    }

    public void setListaProductos(ArrayList<T> listaProductos) {
        this.lista = listaProductos;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void guardar(T t){
        lista.add(t);
    }

    public T sacar(int i){
        if(i < 0 || i > lista.size()){
            throw new IndexOutOfBoundsException();
        }
        T elemento = lista.get(i);;
        return lista.remove(i);
    }

    public void registar(){

    }
}
