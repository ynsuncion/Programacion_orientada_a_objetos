package ar.com.centro8.java.com.poo_ejercicio_01.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Circulo {
 
    private double radio;

    public double getPerimetro(){
        //return 2 * 3.1416 * radio;
        return 2* Math.PI * radio; // es recomendable llamar a pi porque es mas preciso 
    }

    public double getSuperficie(){
        return Math.PI * Math.pow(radio, 2);
    }

}
