package co.edu.uniquindio.poo.arboles;

import co.edu.uniquindio.poo.pilas.Nodo;

public class NodoArbol<T extends Comparable> {

    private T elemento;
    private NodoArbol<T> hijoIzquierdo;
    private NodoArbol<T> hijoDerecho;
    private NodoArbol<T> padre;

    public NodoArbol(T elemento, NodoArbol<T> padre) {
        this.elemento = elemento;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        this.elemento = elemento;
    }

    public NodoArbol<T> getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol<T> hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol<T> getHijoDerecho() {
        return hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol<T> hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public NodoArbol<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoArbol<T> padre) {
        this.padre = padre;
    }

    public void insertar(){

    }
}
