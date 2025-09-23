package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta;

import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public abstract class Cuenta {
 
    private int numeroCuenta;
    private Cliente cliente; // el getter me permite ingresar a cliente 
    private double saldo;

    public abstract void depositarEfectivo(double monto);
    public abstract void extraerEfectivo (double monto);


}
