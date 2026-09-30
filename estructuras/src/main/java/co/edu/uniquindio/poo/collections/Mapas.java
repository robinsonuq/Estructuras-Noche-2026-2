package co.edu.uniquindio.poo.collections;

import java.util.*;

public class Mapas {

    public static void main(String[] args) {

        Map<Estudiante, ArrayList<Estudiante>>  listaEstudiantes = new HashMap<>();//diccionario

        Estudiante estudiante1 = new Estudiante("1234","Andres Felipe");

        Estudiante estudiante2 = new Estudiante("3455","Montoya");
        Estudiante estudiante3 = new Estudiante("3566","Laura");

        ArrayList<Estudiante> grupo1 = new ArrayList<>();// os que perdieron
        grupo1.add(estudiante2);
        grupo1.add(estudiante3);

        listaEstudiantes.put(estudiante1,grupo1);
        listaEstudiantes.put(estudiante2,grupo1);


        ArrayList<Estudiante> estudiantesGrupo1 = listaEstudiantes.get(estudiante1);



        boolean existe = listaEstudiantes.containsKey("34562");
        listaEstudiantes.containsValue(estudiante2);

        listaEstudiantes.remove("1234");

        for(Map.Entry<Estudiante,ArrayList<Estudiante>> estudianteEntry :listaEstudiantes.entrySet()){
            Estudiante identifcacion = estudianteEntry.getKey();
            ArrayList<Estudiante> listaAux = estudianteEntry.getValue();
            for (Estudiante aux : listaAux){
                System.out.println(aux.getNombre());
            }
        }
        ArrayList<Estudiante> estudiantes = listaEstudiantes.get(1);


        Set<Estudiante> claves = listaEstudiantes.keySet();
        for (Estudiante clave : claves){
            ArrayList<Estudiante>  est = listaEstudiantes.get(clave);
        }


        LinkedHashMap<String,Estudiante> lista = new LinkedHashMap<>();//se basa en una lista enlzada y es rapido por la clave
        lista.put("1",estudiante1);
        lista.put("2",estudiante2);
        lista.put("3",estudiante3);

        for (Map.Entry<String, Estudiante> aux : lista.entrySet()){
            System.out.println(aux.getValue());
        }

        TreeMap<Integer,Estudiante> treeMap = new TreeMap<>();

        treeMap.put(1,estudiante1);


        Stack<String> pila = new Stack<>();
        pila.push("Juan");
        pila.push("pedro");
        pila.push("luis");
        pila.push("aldubar");


        String pop = pila.pop();
        String pop1 = pila.pop();
        String po2 = pila.pop();
        String pop3 = pila.pop();
        String pop4 = pila.pop();
        String pop5 = pila.pop();

        String peek = pila.peek();


        Queue<Estudiante> cola1 = new PriorityQueue<>();

        cola1.add(estudiante1);
        estudiante2.setPrioridad(1);

        cola1.add(estudiante2);
        cola1.add(estudiante3);

        cola1.poll();


    }
}
