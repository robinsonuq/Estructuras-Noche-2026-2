package co.edu.uniquindio.poo.colas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.NoSuchElementException;
import java.util.Set;

public class Cola2<T> {

    private Set<T> lista = new HashSet<>();

    public void encolar(T t){
        lista.add(t);
    }

    public T desencolar(T t){
        if(lista.size() == 0){
            throw new NoSuchElementException("No hay elementos");
        }else {
            ArrayList<T> lista2 = new ArrayList<>(lista);
            return lista2.remove(0);
        }
    }
}
