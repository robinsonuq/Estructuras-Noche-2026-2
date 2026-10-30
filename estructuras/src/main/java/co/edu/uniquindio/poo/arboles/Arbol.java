package co.edu.uniquindio.poo.arboles;

import co.edu.uniquindio.poo.pilas.Nodo;

public class Arbol<T extends Comparable> {

    private NodoArbol<T> raiz;
    private int peso;

    Arbol(){
        peso = 0;
        raiz = null;
    }

    public NodoArbol<T> getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol<T> raiz) {
        this.raiz = raiz;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //
    public boolean estaVacio(){
        return  raiz == null;
    }

    // recorridos
    public void inorden(){
        inorden(raiz);
    }
    private void inorden(NodoArbol<T> raizAux){
       if(raizAux == null){
            return;
       }
       inorden(raizAux.getHijoIzquierdo());
       System.out.println(raizAux.getElemento());
       inorden(raizAux.getHijoDerecho());
    }

    public void preorden(){
        preorden(raiz);
    }
    private void preorden(NodoArbol<T> raizAux){
        if(raizAux == null){
            return;
        }
        System.out.println(raizAux.getElemento());
        preorden(raizAux.getHijoIzquierdo());
        preorden(raizAux.getHijoDerecho());
    }
    public void postorden(){
        postorden(raiz);
    }
    private void postorden(NodoArbol<T> raizAux){
        if(raizAux == null){
            return;
        }
        postorden(raizAux.getHijoIzquierdo());
        postorden(raizAux.getHijoDerecho());
        System.out.println(raizAux.getElemento());
    }

    public int obtenerPeso(){
        return obtenerPeso(raiz);
    }
    private int obtenerPeso(NodoArbol<T> raizAux){
        if (raizAux == null) {
            return 0; // caso base: árbol o subárbol vacío
        }
        return 1 + obtenerPeso(raizAux.getHijoIzquierdo())
                + obtenerPeso(raizAux.getHijoDerecho());
    }

    public int calcularAltura(){
        return calcularAltura(raiz);
    }

    private int calcularAltura(NodoArbol<T> raizAux ){
        if(raizAux == null){
            return 0;
        }
        int alturaIzquierda = 1 + calcularAltura(raizAux.getHijoIzquierdo());
        int alturaDerecha = 1 + calcularAltura(raizAux.getHijoDerecho());

        if(alturaIzquierda > alturaDerecha){
            return alturaIzquierda;
        }else return alturaDerecha;
    }
    // hacer el recorrido en amplitud

    public boolean buscarNodo(T buscado){
        return buscarNodo(raiz, buscado);
    }

    private boolean buscarNodo(NodoArbol<T> rootAux,T buscado){
        if (rootAux == null){
            return false;
        }
        int cmp = rootAux.getElemento().compareTo(buscado);
        if(cmp == 0){
            return true;// son iguales
        }
        if(cmp > 0){
            return buscarNodo(rootAux.getHijoIzquierdo(), buscado);
        }
        return buscarNodo(rootAux.getHijoDerecho(), buscado);
    }

    public void insertar(T elemento){

        raiz = insertar(raiz,elemento);
    }
    private NodoArbol<T> insertar(NodoArbol<T> raizAux, T elemento){
        if (raiz == null){
            return new NodoArbol<>(elemento,null);
        }else{

            int cmp = raizAux.getElemento().compareTo(elemento);
            if( cmp == 0){
                throw new RuntimeException("El nodo ya existe");
            }
            if( cmp > 0){
                raizAux.setHijoIzquierdo(insertar(raizAux.getHijoIzquierdo(),elemento));
            }else{
                raizAux.setHijoDerecho(insertar(raizAux.getHijoDerecho(),elemento));
            }
            return raizAux;
        }
    }
    // eliminar nodo
















}
