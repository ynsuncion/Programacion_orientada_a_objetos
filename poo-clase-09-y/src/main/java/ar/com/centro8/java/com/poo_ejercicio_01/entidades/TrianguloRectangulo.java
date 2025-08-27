package ar.com.centro8.java.com.poo_ejercicio_01.entidades;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TrianguloRectangulo {

    // + public 
    // - private


    //atributos
    private double base;
    private double altura;

    public double getPerimetro(){ //la hipotenusa, todo lo que esta dentro del java lang no es necesario importarlo 
      //  return base + altura + Math.sqrt((base*base)+(altura*altura));
      // return base + altura + Math.sqrt((Math.pow(base,2)) + Math.pow(altura, 2));
      return base + altura + Math.hypot(base, altura);
    }
     public double getSuperficie(){
     return base *altura/2;
     }


}
    



