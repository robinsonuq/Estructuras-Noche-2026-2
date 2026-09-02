package co.edu.uniquindio.poo;

public class Recursividad {

    public static void main(String[] args) {
        // Alternativa - Estrategia - Enfoque
        int [] arreglo = {1,2,3,4,5};
        //recorrerIterativo(arreglo);
        recorrerRecursiva(arreglo,4);
        //hacer un metodo recursivo que busque un numero
        // en un arreglo si existe dice true y sino false

        int mayor = obtenerMayorRecursivo(arreglo,0,0);

        int[] numeros = {4, 8, 15, 16, 23, 42};

        System.out.println(buscar(numeros, 15, 0)); // true
        System.out.println(buscar(numeros, 99, 0)); // false
        //imprime el 1
        //imprime nada
        //imprime 2345
        //imprime 54321
        //imprime 5
        //imprime 2
        //imprime 23456
    }

    private static void recorrerIterativo(int[] arreglo) {
        //1. Valor inicial int i = 0
        //2. Condicion de parada
        //3. dar el paso -incremento -avanzar
        //4. iteracion for ( repita
        //5. Las tareas o instrucciones que se repiten
        for ( ; ; ) {
           System.out.println(arreglo[0]);
        }
    }

    private static void recorrerRecursiva(int[] arreglo, int i) {
        //1. Valor inicial int i = 0 ok
        //2. Condicion de parada  ok
        //3. dar el paso -incremento -avanzar ok
        //4. iteracion for o llamar el mismo metodo( repita   ok
        //5. Las tareas o instrucciones que se repiten

        if(i == -1) return; // o == 5 false
         // imprime 1
        System.out.println("Abriendo Matriuska  "+arreglo[i]);
        recorrerRecursiva(arreglo,i-1);
        System.out.println("Cerrando Matriuska  "+arreglo[i]);
    }

    public static boolean buscar(int[] arreglo, int valor, int indice) {
        // Caso base: si el índice llegó al final del arreglo, no se encontró
        if (indice == arreglo.length) {
            return false;
        }
        if (arreglo[indice] == valor) {
            return true;
        }
        return buscar(arreglo, valor, indice + 1);
    }



    public static int obtenerMayorRecursivo(int[] arreglo,int mayor,int i) {
        if (i == arreglo.length) {
          return mayor;
        }
        if(arreglo[i] > mayor) {
           mayor = arreglo[i];
        }
        return obtenerMayorRecursivo(arreglo,mayor,i+1);
    }

    public static int obtenerMayorIterivo(int[] arreglo) {

        int mayor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if(arreglo[i] > mayor) {
                mayor =  arreglo[i];
            }
        }
        return mayor;
    }






}
