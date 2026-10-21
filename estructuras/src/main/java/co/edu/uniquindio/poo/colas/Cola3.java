package co.edu.uniquindio.poo.colas;

import java.util.*;

public class Cola3<T> {

    private T[] arreglo;
    int  puntero = 0;
    int limite;

    public Cola3(int limite){
         arreglo = (T[]) new Object[limite];

    }


    public void encolar(T t){

        if(puntero == arreglo.length){
            throw new ColaLlena("Cola llena");
        }

        arreglo[puntero] = t;
        puntero++;
    }

    public T desencolar(T t){
        if(arreglo.length == 0){
            throw new NoSuchElementException("No hay elementos");
        }else {
            T dato = arreglo[0];
            arreglo= Arrays.copyOfRange(arreglo, 1, arreglo.length);
            return dato;
        }
    }

    // TDA

    // T = tipo  = clasificacion = categoria -estructura-comportamiento
    // D = datos  = informacion
    // A = abstracto = no esta definido, no hay implementacion

    // arraylist es una lista dinamica,  es un arreglo

    // Animal   TDA
}
