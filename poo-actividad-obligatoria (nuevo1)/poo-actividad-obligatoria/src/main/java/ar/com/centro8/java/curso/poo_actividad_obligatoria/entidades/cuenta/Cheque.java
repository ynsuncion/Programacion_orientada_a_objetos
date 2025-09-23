package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Cheque {
    private double monto;
    private String bancoEmisor;
    private LocalDate fecha;

    public Cheque(double monto, String bancoEmisor) {
        this.monto = monto;
        this.bancoEmisor = bancoEmisor;
        this.fecha = LocalDate.now(); // automaticamente, asigna el valor a la fecha
    }

}
