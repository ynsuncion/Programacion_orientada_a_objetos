package ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones;

public class EmpleadoAsociacionSimple {
    //La asociacion simple es la relacion menos acoplada 
    //La reconocemos con las palabras "usa un/a"
    //por ejemplo, en este caso, un empleado usa un auto

    private int legajo;
    private String nombre;
    private String apellido;

    public void usaAuto(Auto auto){
        System.out.println("El empleado " + this.nombre + " " + this.apellido + " está utilizando " + "el auto " + auto);
    }


}
