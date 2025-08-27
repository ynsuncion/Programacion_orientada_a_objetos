package ar.com.centro8.java.com.poo_ejercicio_01.tests;

import ar.com.centro8.java.com.poo_ejercicio_01.entidades.Circulo;
import ar.com.centro8.java.com.poo_ejercicio_01.entidades.Rectangulo;
import ar.com.centro8.java.com.poo_ejercicio_01.entidades.TrianguloRectangulo;

public class TestClass {
    public static void main(String[] args) {

        Rectangulo rectangulo1 = new Rectangulo(0, 0);
        System.out.println(rectangulo1);

        System.out.println("Perímetro:" + rectangulo1.getPerimetro());
        System.out.println("Superficie: " + rectangulo1.getSuperficie() ); // llama a los miembros que representan la clase objeto
        
    System.out.println("\n** Triangulo rectangulo : **");
        TrianguloRectangulo Triangulo1 = new TrianguloRectangulo(45,12.78);
        System.out.println(Triangulo1);
        System.out.println("Perímetro: " + Triangulo1.getPerimetro());
        System.out.println("Superficie: " + Triangulo1.getSuperficie());

        System.out.println("\n** Círculo: **");
        Circulo circulo1 = new Circulo(23.48);
        System.out.println(circulo1);
        System.out.println("Perímetro: " + circulo1.getPerimetro());
        System.out.println("Superficie: " + circulo1.getSuperficie());
        




        TrianguloRectangulo trianguloRectangulo1 = new TrianguloRectangulo(0, 0);

    }
}
