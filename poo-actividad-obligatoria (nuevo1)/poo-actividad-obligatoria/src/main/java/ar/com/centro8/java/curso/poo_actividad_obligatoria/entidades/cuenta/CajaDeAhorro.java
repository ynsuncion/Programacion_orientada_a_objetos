package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta;

import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente.Cliente;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true) //para que me muestre los valores de la clase padre

public class CajaDeAhorro extends Cuenta {
    private double tasaDeInteres;

    

    public CajaDeAhorro(int numeroCuenta, Cliente cliente, double saldo, double tasaDeInteres) {
        super(numeroCuenta, cliente, saldo);
        this.tasaDeInteres = tasaDeInteres;
    }

    public void cobrarInteres(){ // es un metodo que pertenece a esta clase
        // saldo + interes (saldo x %5)


    // realizar una validacion al ingreso de ingreso del interes, que sea de 0 al 100 
    
        setSaldo(getSaldo() + (getSaldo()* this.tasaDeInteres/100));

        
    }

    @Override // porque viene de la clase padre
    public void depositarEfectivo(double monto) {
        if (monto > 0) { 
            setSaldo(getSaldo()+ monto); // modifica el saldo, saldo esta en la clase padre, Cuenta
        } else {
            System.out.println("El monto ingresado es negativo");
        }
        
    } 

    @Override
    public void extraerEfectivo(double monto) {
        if (monto <= getSaldo() && monto > 0 ) { // verifica que entre un valor positivo y este dentro del monto 
            setSaldo(getSaldo() - monto);
        } else { 
            System.out.println("El valor ingresado es negativo o posee suficiente saldo");

        }
    }

}
