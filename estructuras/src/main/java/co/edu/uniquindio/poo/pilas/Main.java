package co.edu.uniquindio.poo.pilas;

public class Main {

    //don`t give up
    public static void main(String[] args) {
        Pila<Integer> pila1 = new Pila<>();

        pila1.push(6);
        pila1.push( 5);
        pila1.push( 4);
        pila1.push( 3);
        pila1.push( 2);

        System.out.println("Pila original----------------------------");
        pila1.imprimir();



        //{2,
        // 3,
        // 4,
        // 5,
        // 6}

        Pila<Integer> pila2 = new Pila<>();

        pila2.push(4);
        pila2.push( 6);
        pila2.push( 7);
        pila2.push( 8);
        pila2.push( 9);
        //{9,
        // 8,
        // 7,
        // 6,
        // 4}
       pila1.add(pila2);

        pila1.


        //{9,
        // 8,
        // 7,
        // 6,
        // 4
        // 2,
        // 3,
        // 4,
        // 5,
        // 6}
        System.out.println("Pila agregada----------------------------");
        pila1.imprimir();

        System.out.println("----------------------------------------");

        System.out.println("Pila 2");
        pila2.imprimir();

    }
}
