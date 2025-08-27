package ar.com.centro8.java.com.poo_ejercicio_01.tests;

import java.util.List;

import ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones.ClienteMayorista;
import ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones.ClienteMinorista;
import ar.com.centro8.java.com.poo_ejercicio_01.entidades.relaciones.Cuenta;

public class TestRelaciones {
    public static void main(String[] args) {
        System.out.println("** Test de la clase cuenta **");

        Cuenta cuenta1 = new Cuenta(1, "pesos argentinos");
        System.out.println(cuenta1);

        cuenta1.depositar(100000);
        cuenta1.getSaldo();
        System.out.println(cuenta1.getSaldo());
        cuenta1.depositar(200000);
        System.out.println(cuenta1.getSaldo());
        cuenta1.debitar(123.46f);
        System.out.println(cuenta1.getSaldo());

        Cuenta cuenta2 = new Cuenta(2, "dólares");
        System.out.println(cuenta2);
        cuenta2.depositar(7500);
        cuenta2.debitar(10000);
        System.out.println(cuenta2.getSaldo());

        System.out.println( "** Clase cuenta funcionando correctamente**" );

        System.out.println("\n** Test de la clase ClienteMinorista **");

        ClienteMinorista cliente1 = new ClienteMinorista(1, "Carlos", "Noguera", cuenta1);
        System.out.println(cliente1);
        //cliente1.depositar (10000);
        //error, porque el método depositar no es del ClienteMinorista, es un método de la clase cuenta
        cliente1.getCuenta().depositar(10000); 
        System.out.println(cliente1);
        
        ClienteMinorista cliente2 = new ClienteMinorista(2, "Romina", "villegas", new Cuenta(3, "Reales"));
        System.out.println(cliente2);

        ClienteMinorista nuevoClienteMinorista3 = new ClienteMinorista(3, "Federico", "Castañeda", cuenta2);
        //creamos un apuntador
        Cuenta cta3 = nuevoClienteMinorista3.getCuenta();
        //significa que cta3 es la cuenta del objeto nuevoClienteMinorista3
        //no es un nuevo objeto
        System.out.println(nuevoClienteMinorista3);
        System.out.println(nuevoClienteMinorista3.getCuenta());
        System.out.println(cta3);
        cta3.depositar(1000);
        System.out.println(nuevoClienteMinorista3);





        System.out.println("\n/////////////////////////\n");
        System.out.println("\n** Test de la clase ClienteMayorista **");
        ClienteMayorista cliente4 = new ClienteMayorista(12, "Supermercados Júpiter", "Jujuy 132");
        System.out.println(cliente4);

        //creamos un apuntador para facilitar el manejo de las cuentas 
        List<Cuenta> cuentas4 = cliente4.getCuentas();

        Cuenta cuenta3 = new Cuenta(4, "Libras esterlinas");
        //con el metodo add() agregamos cuentas a la lista
        cuentas4.add(cuenta3);
        cuentas4.add(new Cuenta(0, null));






















































































































        


    }
}
