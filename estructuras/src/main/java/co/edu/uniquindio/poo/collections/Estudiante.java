package co.edu.uniquindio.poo.collections;

import java.util.Objects;

public class Estudiante implements  Comparable<Estudiante>{
    private String identificacion;
    private String nombre;
    private int prioridad;


    public Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        prioridad = 5;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(identificacion, that.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(identificacion);
    }

    @Override
    public int compareTo(Estudiante o) {
        return this.prioridad -prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }
}
