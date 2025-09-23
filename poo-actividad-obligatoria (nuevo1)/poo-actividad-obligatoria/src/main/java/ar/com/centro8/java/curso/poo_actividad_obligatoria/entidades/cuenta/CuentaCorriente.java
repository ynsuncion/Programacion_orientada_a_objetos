package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta;

import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString(callSuper = true)

public class CuentaCorriente extends Cuenta {

    private double montoGiroEnDescubierto;
    Cheque Cheque;

    public CuentaCorriente(int numeroCuenta, Cliente cliente, double saldo, double montoGiroEnDescubierto,
            Cheque cheque) {
        super(numeroCuenta, cliente, saldo);
        this.montoGiroEnDescubierto = montoGiroEnDescubierto;
        Cheque = cheque;
    }

    @Override
    public void depositarEfectivo(double monto) {
        if (monto > 0) {
            setSaldo(getSaldo() + monto);
        } else {
            System.out.println("Monto ingresado invalido");
        }
    }

    @Override
    public void extraerEfectivo(double monto) {

        if (monto <= getSaldo() + this.montoGiroEnDescubierto) { // this. es para acceder al atributo
            setSaldo(getSaldo() - monto);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void depositarCheque(Cheque cheque) {

        setSaldo(cheque.getMonto() + getSaldo());
    }

}
