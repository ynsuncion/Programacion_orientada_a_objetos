package ar.com.centro8.java.com.poo_ejercicio_01.entidades;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString // es lo que te permite ver el estado del objeto 
@AllArgsConstructor //se crea en tiempo de compilacion
//cuando usamos lombok, se hace mas cortito 
public class Rectangulo {

    private double lado1;
    private double lado2;

    public double getPerimetro(){
        //obtiene el perimetro 
        return 2* (lado1 + lado2);
    }

    public double getSuperficie(){
        //obtener la superficie
        return lado1 + lado2;
    }

}
