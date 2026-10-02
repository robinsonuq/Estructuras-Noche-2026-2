package co.edu.uniquindio.poo.carrito;

import java.util.*;

public class Carrito<T extends Producto> implements Iterable<T> {

    private final String nombre;
    private final List<T> listaProductos;

    public Carrito (String nombre){
        this.nombre = nombre;
        listaProductos = new ArrayList<>();
    }

    public Collection<T> getListaProductos() {
        return Collections.unmodifiableCollection(listaProductos);
    }

    public void agregar(T t){
        listaProductos.add(t);
    }

    public T obtenerProductoMayor(){
        if(listaProductos.isEmpty()){
            throw new RuntimeException("No hay productos en el carro aun");
        }
        T mayor = listaProductos.get(0);
        double precioMayor = 0;
        for (T t : listaProductos){
            if(t.getPrecio()  > precioMayor){
                mayor = t;
                precioMayor = t.getPrecio();
            }
        }
        return mayor;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (T p : listaProductos) {
            total += p.getPrecio();
        }
        return total;
    }


    @Override
    public CarritoIterator<T> iterator() {
        return new CarritoIterator<>(listaProductos);
    }
}
