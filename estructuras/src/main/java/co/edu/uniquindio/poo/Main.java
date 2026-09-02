package co.edu.uniquindio.poo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)  {

       int a = 150000000;
       int b = 2000000;

        try {
            retirar(a,b);
        } catch (RetiroException e) {
            llamarAPapa();
        }
    }

    private static void llamarAPapa() {
        System.out.println("Yo le presto");
    }

    private static int retirar(int saldo, int valorRetirar) throws RetiroException {

        if(valorRetirar > saldo){
            throw new RetiroException("Robinson no tiene plata para su esposa");
        }
        System.out.println("retiro exitoso");
        return saldo - valorRetirar;
    }



    public void imprimirArreglo(int [] arreglo){

        Main m = new Main();

        try {
            m.main(null);
        } catch (Exception e) {

        }


        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+" ");
        }
    }

    public void imprimirArreglo2(int [] arreglo){

        for(int i = arreglo.length-1; i >= 0; i--){

        }
    }
}