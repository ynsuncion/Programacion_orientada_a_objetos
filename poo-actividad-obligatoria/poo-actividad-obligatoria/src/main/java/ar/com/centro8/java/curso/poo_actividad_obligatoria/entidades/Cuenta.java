package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades;

import lombok.Data;


public abstract class Cuenta {
 
    private int numeroCuenta;
    private Cliente cliente; // el getter me permite ingresar a cliente 
    private double saldo;

    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo (double monto);


}
