package co.edu.uniquindio.poo.genericos;

import java.util.ArrayList;

public class MiPrimeraClaseGenerica<T> {

    private ArrayList<T> lista;





    public MiPrimeraClaseGenerica(T t, T t2){
        this.t1 = t;
        this.t2 = t2;
    }
    public MiPrimeraClaseGenerica(){

    }

    public T getT1() {
        return t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public T getT2() {
        return t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }
}
