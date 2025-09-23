package ar.com.centro8.java.curso.tests;

import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente.ClienteEmpresa;
import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cliente.ClienteIndividual;
import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta.CajaDeAhorro;
import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta.Cheque;
import ar.com.centro8.java.curso.poo_actividad_obligatoria.entidades.cuenta.CuentaCorriente;

public class TestSistemaBancario {
    public static void main(String[] args) {
        System.out.println( "Test de la clase cliente individual");
        ClienteIndividual cliente1 = new ClienteIndividual(1, "Yamila", "Sunción", "95355361");
        System.out.println(cliente1);


        System.out.println( "Test de la clase cliente empresa");
        ClienteEmpresa clienteEmpresa = new ClienteEmpresa(2, "HolaYamila", "27953553614");

        System.out.println( "Test de la clase caja de ahorro");
        CajaDeAhorro cajaDeAhorro = new CajaDeAhorro(2, clienteEmpresa, 500, 0.05);
        System.out.println("el monto depositado es " + cajaDeAhorro.getSaldo());
        cajaDeAhorro.depositarEfectivo(110);
        System.out.println(cajaDeAhorro); //610
        cajaDeAhorro.extraerEfectivo(210);
        System.out.println(cajaDeAhorro); // 400
        cajaDeAhorro.cobrarInteres();
        System.out.println(cajaDeAhorro);

        

        System.out.println("Test de la clase cuenta corriente");

        CuentaCorriente cuentaCorriente = new CuentaCorriente(3, clienteEmpresa, 500, 100, new Cheque(300, "Santander"));
        // objeto anidado , donde un objeto (el contenedor) contiene una referencia a otro objeto (el contenido) como uno de sus atributos. 
        System.out.println(cuentaCorriente);

        cuentaCorriente.depositarEfectivo(300);
        System.out.println(cuentaCorriente.getSaldo()); // primero el objeto y despues el metodo
        







    }
}
