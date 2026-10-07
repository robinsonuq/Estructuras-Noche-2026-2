package co.edu.uniquindio.poo.listas.listasimple;

public class ListaEnlazadaSimple {

    private int size;
    private Nodo nodoPrimero;

    public ListaEnlazadaSimple() {
        size = 0;
        nodoPrimero = null;
    }

    public int getSize() {
        return size;
    }

    private void setSize(int size) {
        this.size = size;
    }

    // 1. agregar al inicio
    public void addFirst(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(isEmpty()){
            nodoPrimero = nuevoNodo;
        }else{
            nuevoNodo.setSiguiente(nodoPrimero);
            nodoPrimero = nuevoNodo;
        }
        size++;
    }
    // 2. agregar al final
    public void addLast(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        if(isEmpty()){
            nodoPrimero = nuevoNodo;
        }else{
            Nodo auxiliar = nodoPrimero;//inicializacion
            while(auxiliar.getSiguiente() != null){// condicion parada y ciclo
                auxiliar = auxiliar.getSiguiente();//incremento
            }
            auxiliar.setSiguiente(nuevoNodo);
        }
        size++;
    }

    private boolean isEmpty() {
        return size == 0;
    }


    public void imprimir() {
        Nodo auxiliar = nodoPrimero;//inicializacion
        while(auxiliar != null){// condicion parada y ciclo
            System.out.print(auxiliar.getDato()+" -> ");// instrucciones que se repiten
            auxiliar = auxiliar.getSiguiente();//incremento
        }
    }
    public void imprimir2() {
        // i = 0  ; i < lista.size; i++
        for(Nodo auxiliar = nodoPrimero; auxiliar != null; auxiliar = auxiliar.getSiguiente()){
            // inicializacion, condicion parada, incremento, ciclo, instrucciones que se repiten
            System.out.print(auxiliar.getDato()+" -> ");
        }
    }







    public void imprimir3( ) {
        imprimir3(nodoPrimero);//inicializacion
    }

    private void imprimir3(Nodo aux ) {
        if(aux == null){// condicion parada
            return;
        }else {
            imprimir3(aux.getSiguiente());//ciclo e incremento
            System.out.print(aux.getDato()+" -> ");//instrucciones que se repiten
        }
    }


}
