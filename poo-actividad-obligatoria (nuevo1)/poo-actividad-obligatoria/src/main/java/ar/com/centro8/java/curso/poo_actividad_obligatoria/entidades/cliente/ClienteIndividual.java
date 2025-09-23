package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter 
@ToString(callSuper = true)

public class ClienteIndividual extends Cliente{
    private String nombre;
    private String apellido;
    private String dni;

    //creo el constructor para darles valor a un objeto en la clase cliente 

    public ClienteIndividual(int numeroCliente, String nombre, String apellido, String dni) {
        super(numeroCliente);
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    

}
