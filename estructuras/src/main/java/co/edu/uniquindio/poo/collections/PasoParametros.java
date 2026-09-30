package co.edu.uniquindio.poo.collections;

// en java el paso de los parametros es por valor
public class PasoParametros {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Robinson","1",23);
        cliente = cambiarNombre(cliente);
        System.out.println(cliente.getNombre());
        int numero = 10;
        numero = sumar (numero);
    }
    private static int sumar(int miEx) {
        miEx = miEx * 10;
        return miEx;
    }
    private static Cliente cambiarNombre(Cliente cliente2) {//mal paso por referencia
        cliente2 = new Cliente("Juan","",23);
        cliente2.setNombre("Pedro");
        return cliente2;
    }

}
