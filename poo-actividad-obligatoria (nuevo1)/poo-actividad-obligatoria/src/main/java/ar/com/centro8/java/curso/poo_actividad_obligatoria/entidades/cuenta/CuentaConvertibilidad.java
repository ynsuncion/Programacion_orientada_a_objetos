package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta;

import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class CuentaConvertibilidad extends CuentaCorriente {

    private double saldoDolares;

    public CuentaConvertibilidad(int numeroCuenta, Cliente cliente, double saldo, double montoGiroEnDescubierto,
            Cheque cheque) {
        super(numeroCuenta, cliente, saldo, montoGiroEnDescubierto, cheque);

    }

    public void depositarDolares(double montoDolares) {
        if (montoDolares > 0) {
            saldoDolares += montoDolares;

        } else {
            System.out.println("El monto ingresado es negativo");
        }

    }

    public void extraerDolares(double montoDolares) {

        if (montoDolares >= 0 && this.saldoDolares >= montoDolares) { // this. es para acceder al atributo
            saldoDolares -= montoDolares;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void convertirDolaresAPesos(double montoDolares, double valorCotizacion) {
        if (montoDolares > 0) {
            if (this.saldoDolares >= montoDolares) { // verifica que tenga esa cantidad de dolares
                setSaldo(getSaldo() + montoDolares * valorCotizacion);
                this.saldoDolares -= montoDolares; // disminuye el valor del saldo dolares
            } else {
                System.out.println("Saldo en dolares insuficiente");
            }

        } else {
            System.out.println("El monto ingresado no debe ser negativo");
        }

    }

    public void convertirPesosADolares(double montoPesos, double valorCotizacion) {

        if (montoPesos > 0) {
            if (getSaldo() >= montoPesos) {
                setSaldo(getSaldo() - montoPesos);
                this.saldoDolares += montoPesos / valorCotizacion;
            }

        } else {
            System.out.println("El monto ingresado no debe ser negativo");
        }

    }

}
