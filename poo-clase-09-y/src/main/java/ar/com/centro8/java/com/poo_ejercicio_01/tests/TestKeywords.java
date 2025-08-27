package ar.com.centro8.java.com.poo_ejercicio_01.tests;

import ar.com.centro8.java.com.poo_ejercicio_01.entidades.keywords.Automovil;

public class TestKeywords {
    public static void main(String[] args) {
        System.out.println("** Test de Automovil (Keywords) **");

        Automovil auto1 = new Automovil("Chevrolet", "Spin", "Blanco");
        System.out.println(auto1);
        System.out.println(auto1.getVelocidad());
        System.out.println(Automovil.getVelocidad());
        auto1.acelerar(20);
        System.out.println(auto1.getVelocidad()); //20
        System.out.println(Automovil.getVelocidad()); //20

        Automovil auto2 = new Automovil("Ford", "Focus", "Violeta");
        System.out.println(auto2);
        System.out.println(auto2.getVelocidad()); //20
        Automovil.frenar(5);
        System.out.println(auto1.getVelocidad()); //15
        System.out.println(Automovil.getVelocidad()); //15 


        
        
    }
    

}
