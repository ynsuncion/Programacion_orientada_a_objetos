public class Clase02 {
    public static void main(String[] args) {

        System.out.println("Hola mundo!"); // esta linea representa una sentencia, es una orden a ejecutar 

        // syso + tab o sout + tab -> System.out.println("");
        // ctrl + shift + k -> eliminar una fila 

        /*
         * buenas practicas, cuando algo funciona de determinada manera, si no escribimos con buenas practicas aunque ande 
         * no esta bien, es importante seguir las buenas practicas 
         */


         //declaracion de variables
         int variable; // declaracion de variable con el tipo de dato y el identificador, reservar el espacip
         variable = 10; // asignacion de valor a la variable, no vuelvo a declarar el espacio solo le asigno el valor 
         int variable2 = 10; // declaracion y asignacion de valor en una misma linea
         int variable3 = 10, variable4 = 20, variable5 = 30;// declaracion y asignacion multiple en linea 

         /*
          * Java es un lenguaje fuertemente tipado, por lo cual deben respetarse pautas
          * no se puede asignar otro tipo de dato 
          */

          // tipo de datos primitivos 
          // byte - ocupa 1 byte y representa un numero entero entre -128 y 127
          byte variableByte = 100;
          System.out.println(variableByte);

          //short - ocupa 2 bytes y representa un número entero entre -32.768 y 32.767
          short variableShort = -32768;
          System.out.println(variableShort);

          //int - ocupa 4 bytes y representa un numero entero entre -2.147.483.648 y 2.147.483.647
          int variableInt = 32464654;
          System.out.println(variableInt);

          // long - ocupa 8 bytes y representa un numero entero muy grande que va desde -2 elevado a la 
          // hasta 2 elevado a la 63,menos 1
          long variableLong = 161321345456431L; // debe llevar una L al final de la literal 
          // por convencion utilizamos la L mayuscula para no confundirlo con un 1 
          System.out.println(variableLong);

          //float - acupa 4 bytes y representa un numero con decimales 
          // tiene al rededor de 6-7 digitos de precision total
          float variableFloat = 1234.34f; // debe llevar una f al final de la literal 
          // los decimales se separa con punto
          System.out.println(variableFloat);

          //Double 
          //tiene al rededor de 15-16 digitos de precision total 
          double variableDouble =3244.45; //no hace falta agregarle una letra al final 

          //boolean 

          // tabla unicode 
          //unicode es un standard de codificacion de carateres a nivel mundial 
          char variableChar = 65;
          System.out.println(variableChar);
          //tambien se puede almacenar 
          


        

    } // final del metodo main
} // final de la clase 