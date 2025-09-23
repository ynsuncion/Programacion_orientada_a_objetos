package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
@Setter
@AllArgsConstructor // genera un constructor de todos los atributos de la clase

public abstract class Cliente {

    // el getter permite que otro acceda
    //borrar el metodo en el uml
    private int numeroCliente; 
}
