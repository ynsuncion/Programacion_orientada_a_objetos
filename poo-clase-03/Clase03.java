public class Clase03 {
    public static void main(String[] args) { // psvm -> atajo para crear el main

        // ESTRUCTURAS

        // condicionales

        // if

        int numero1 = 100;
        int numero2 = 20;

        if (numero1 > numero2) {
            System.out.println("El número1 es mayor que el numero2");
        }

        // if en linea
        if (numero1 > numero2)
            System.out.println("El número1 es mayor que el numero2");

        // evitamos el uso de las llaves si solo se ejecutará una única sentencia
        // si se van a ejecutar más de una sentencia, se deben colocar las llaves

        // if-else
        if (numero1 > numero2) { // ife -> atajo para el if else
            System.out.println("El número1 es mayor que el numero2");

        } else {
            System.out.println("El número1 no es mayor que el numero2");
        }

        // if - else en linea
        if (numero1 > numero2)
            System.out.println("El número1 es mayor que el numero2");
        else
            System.out.println("El número1 no es mayor que el numero2");


            // if - else en cascada (if - else if - else)
    if (numero1 > numero2) { 

    }

        int edad = 22;
        boolean tienePasaporte = true;

        if (tienePasaporte) {
            if (edad >= 18) {
                System.out.println("Puede viajar solo.");
            } else {
                System.out.println("Debe viajar acompañado por un mayor.");
            }
        } else {
            System.out.println("No puede viajar.");
        }

        // operador ternario
        // variable = (condicion) ? valor_si_verdadero : valor_si_falso; (variable es
        // donde guardo el resultado )

        String mensaje = (edad >= 18) ? "Es mayor de edad " : "Es menor de edad";
        System.out.println(mensaje);

        //estructura switch case
        int dia = 5; 
        switch (dia) {
            case 1: System.out.println("Lunes"); break;
            case 2: System.out.println("Martes"); break;
            case 3: System.out.println("Miercoles"); break;
            case 4: System.out.println("Jueves"); break;
            case 5: System.out.println("Viernes"); break;
            case 6: System.out.println("Sabado"); break;
            case 7: System.out.println("Domingo"); break;
            default: System.out.println("El día ingresado no es valido");
        }
        //en los switch tradicionales no es obligatorio el uso del default 

        switch (dia) {
            case 1,2,3,4,5: System.out.println("Es día de semana"); break;
            case 6,7: System.out.println("Es fin de semana"); 
                
        }

        // ESTRUCTURAS REPETITIVAS
        //while
        int contador = 1;
        while (contador <= 10){
            System.out.println();
        }

    }
}