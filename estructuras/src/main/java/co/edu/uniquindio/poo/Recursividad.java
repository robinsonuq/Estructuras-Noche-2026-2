package co.edu.uniquindio.poo;

public class Recursividad {

    static void main() {
        int arreglo[] = {1,2,3,4,5};
        int suma = sumaDivide(arreglo,0,arreglo.length-1);
        System.out.println(suma);
    }
    public static int sumaDivide(int[] arreglo,int inicio, int fin ){
        if(inicio == fin){
            return arreglo[inicio];
        }
        int mitad = ( inicio + fin )/2;
        int sumIzq = sumaDivide(arreglo,inicio,mitad);
        int sumder = sumaDivide(arreglo,mitad + 1,fin);
        return sumIzq + sumder;
    }

    public static int binarySearch(int[] arreglo,int inicio, int fin, int buscado ){
        if(inicio > fin){
            return -1;
        }
        int mitad = ( inicio + fin )/2;

        if(arreglo[mitad] == buscado){
            return mitad;
        }

        return buscado > arreglo[mitad]
                ? binarySearch(arreglo,mitad+1,fin,buscado)
                : binarySearch(arreglo,inicio,mitad-1,buscado);


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

    //int[] numeros = {2, 3, 1, 6}


    // 4
    //18
    //14












}
