package ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class ClienteMinorista {

    private int nro;
    private String nombre;
    private String apellido;
    private Cuenta cuenta;

}
