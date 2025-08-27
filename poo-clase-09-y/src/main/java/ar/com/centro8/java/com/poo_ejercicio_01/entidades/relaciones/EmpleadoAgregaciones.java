package ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones;

import lombok.Data;

@Data
public class EmpleadoAgregaciones {

    //Las agregaciones, son un tipo de relacion un poco mas fuertes entre clases 
    //son de las mas utilizadas
    //la reconocemos con las palabras "tiene un/a"
    //por ejemplo en este caso, un empleado tiene un auto 

    private int legajo;
    private String nombre;
    private String apellido;
    private Auto auto;

    public EmpleadoAgregaciones(int legajo);

}
