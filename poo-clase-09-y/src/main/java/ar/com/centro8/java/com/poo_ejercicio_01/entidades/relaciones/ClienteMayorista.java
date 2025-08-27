package ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ClienteMayorista {
    private int nro;
    private String razonSocial;
    private String direccion;
    private List<Cuenta> cuentas; // List es una interfaz, los vectores o arrays son estaticos, eso que definimos queda fijo 
            //muchas veces termina siendo obsoleto, por eso no es muy recomendable usarlos

    //No utilizamos Arreglos porque son estaticos, no se puede modificar la cantidad de elementos 
    //es decir, que se crea una cantidad fija de cuentas, no se podria modificar
    //es por eso, que necesitamos una lista dinamica, por eso utilizamos la interface List<>

    public ClienteMayorista(int nro, String razonSocial, String direccion) {
        this.nro = nro;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.cuentas = new ArrayList<>();
        //ArrayList<> es una clase que implementa la interfaz de List<>
    }

    //al crear un objeto de la clase, se inicializa con un List de cuentas 
    
}
