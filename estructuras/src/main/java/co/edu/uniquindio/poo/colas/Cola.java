package co.edu.uniquindio.poo.colas;

import java.util.NoSuchElementException;

public class Cola<T> {

    private int size;
    private Nodo<T> nodoPrimero;
    private Nodo<T> nodoUltimo;
    private int limite;
    /**
     * No hay elementos en la cola
     */
    public Cola(int limite ) {
        size = 0;
        nodoPrimero = null;
        nodoUltimo = null;
        this.limite = limite;
    }

    public int getSize() {
        return size;
    }

    // 2. agregar al final de la cola
    public void encolar(T dato){
        if(size == limite){
            throw new ColaLlena("La cola esta llena");
        }

        Nodo<T> nuevoNodo = new Nodo<T>(dato);
        if(isEmpty()){
            nodoPrimero = nuevoNodo;
            nodoUltimo = nuevoNodo;
        }else{
            nodoUltimo.setSiguiente(nuevoNodo);
            nodoUltimo = nuevoNodo;
        }
        size++;
    }
    // 2. eliminar al inicio de la cola
    public T desencolar(){
        if(isEmpty()){
           throw new NoSuchElementException("No hay elemntos en la cola");
        }else{
            T dato = nodoPrimero.getDato();
            nodoPrimero = nodoPrimero.getSiguiente();
            if(nodoPrimero == null){
                nodoUltimo = null;
            }
            size--;
            return dato;
        }

    }

    private boolean isEmpty() {
        return size == 0;
    }


    public void imprimir() {
        Nodo<T> auxiliar = nodoPrimero;//inicializacion
        while(auxiliar != null){// condicion parada y ciclo
            System.out.print(auxiliar.getDato()+" -> ");// instrucciones que se repiten
            auxiliar = auxiliar.getSiguiente();//incremento
        }
    }
    public void imprimir2() {
        // i = 0  ; i < lista.size; i++
        for(Nodo<T> auxiliar = nodoPrimero; auxiliar != null; auxiliar = auxiliar.getSiguiente()){
            // inicializacion, condicion parada, incremento, ciclo, instrucciones que se repiten
            System.out.print(auxiliar.getDato()+" -> ");
        }
    }

    public void imprimir3( ) {
        imprimir3(nodoPrimero);//inicializacion
    }

    private void imprimir3(Nodo<T> aux ) {
        if(aux == null){// condicion parada
            return;
        }else {
            imprimir3(aux.getSiguiente());//ciclo e incremento
            System.out.print(aux.getDato()+" -> ");//instrucciones que se repiten
        }
    }


}
