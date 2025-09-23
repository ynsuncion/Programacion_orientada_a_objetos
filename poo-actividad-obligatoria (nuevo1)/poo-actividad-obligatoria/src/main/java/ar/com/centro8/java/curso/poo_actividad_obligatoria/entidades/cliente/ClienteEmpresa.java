package ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString (callSuper = true) // llamo al to string de la clase padre para que muestre los datos

public class ClienteEmpresa extends Cliente {
    
    private String nombreFantasia;
    private String cuit;


    public ClienteEmpresa(int numeroCliente, String nombreFantasia, String cuit) {  // cree el constructor que incluye los valores de la clase padre
        super(numeroCliente);
        this.nombreFantasia = nombreFantasia;
        this.cuit = cuit;
    }

    
   
}


