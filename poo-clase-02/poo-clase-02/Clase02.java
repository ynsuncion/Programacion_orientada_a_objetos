public class Clase02 {
    public static void main(String[] args) {
        /*
         * Tipos de escritura:
         * camel case -> estoEsUnaFraseEnCamelCase (variables y métodos)
         * pascal case -> EstoEsUnaFraseEnPascalCase (clases e interfaces)
         * snake case -> esto_es_una_frase_en_snake_case (sql)
         * kebab case -> esto-es-una-frase-en-kebab-case (nombre de proyectos o carpetas)
         */

        /*
         * Instituto: Centro de Formación Profesional N°8 - SMATA
         * Curso: Programación Orientada a Objetos
         * Lenguaje principal: Java
         * Cursada: Lunes, martes y miércoles de 10 a 13.30hs.
         * Profesor: Francisco Acuña
         * Email: franciscoacuna.centro8@gmail.com
         * Repositorio: https://github.com/Francisco-Acuna/2025_2C_POO_TURNO_MANIANA
         * Softwares necesarios:
         *  - JDK 21 -> https://www.oracle.com/java/technologies/downloads/#java21
         *  - Visual Studio Code -> https://code.visualstudio.com/
         *  - Extensión para VSC -> Extension Pack For Java (by Microsoft)
         *  - MySQL y Workbench -> https://dev.mysql.com/downloads/installer/
         */

        //comentarios en línea

        /*
         * bloque
         * de 
         * comentarios
         */

        /**
         * Comentarios
         * del tipo
         * JavaDOC
         * Se utilizan para documentación puntual 
         */ 

        //Etiquetas en los comentarios

        //TODO: indica las tareas pendientes por implementar o finalizar

        //FIXME: señala errores o problemas que deben ser corregidos

        //estas palabras no son parte del lenguaje Java como tal, sino convenciones que se usan
        //dentro de los comentarios. Muchos editores o IDEs las reconocen y resaltan automáticamente
        //para facilitar la colaboración y el seguimiento de tareas en el código.

        //instalar TODO TREE
        System.out.println("Hola Mundo!"); //esto es una sentencia
        // syso + tab o sout + tab -> System.out.println("");
        // ctrl + shift + k -> eliminar una fila

        //declaración de variables
        int variable; //declaración de variable con el tipo de dato y el identificador
        variable = 10; //asignación de valor a la variable
        int variable2 = 10; //declaración y asignación de valor en una misma línea
        int variable3 = 10, variable4 = 20, variable5 = 30; //declaración y asignación múltiple en línea
        
        /*
         * Java es un lenguaje fuertemente tipado, por lo cual deben respetarse ciertas pautas.
         * No se puede asignar otro tipo de dato como valor a una variable ya declarada.
         * No se puede cambiar el tipo de dato de una variable ya declarada.
         * No se puede crear otra variable con el mismo nombre.
         * Una variable puede tener una única declaración.
         * Una variable puede tener innumerables valores, siempre que sean del mismo tipo de dato.
         */

        //Tipos de datos primitivos
        
        //byte - ocupa 1 byte y representa un número entero entre -128 y 127
        byte variableByte = 100;
        System.out.println(variableByte); 

        //short - ocupa 2 bytes y representa un número entero entre -32.768 y 32.767
        short variableShort = -32768;
        System.out.println(variableShort);

        //int - ocupa 4 bytes y representa un número entero entre -2.147.483.648 y 2.147.483.647
        int variableInt = 32464654;
        System.out.println(variableInt);

        //long - ocupa 8 bytes y representa un número entero muy grande que va desde -2 elevado a la 63
        //hasta 2 elevado a la 63, menos 1
        long variableLong = 161321345456431L; //debe llevar una L al final de la literal
        //por convención utilizamos la L mayúscula para no confundirlo con un 1
        System.out.println(variableLong);

        //float - ocupa 4 bytes y representa un número con decimales
        //tiene alrededor de 6-7 digitos de precisión total
        float variableFloat = 1234.34f; //debe llevar una f al final de la literal
        //los decimales se separan con un punto
        System.out.println(variableFloat);
        
        //double - ocupa 8 bytes y representa un número con decimales
        //tiene alrededor de 15-16 dígitos de precisión total
        double variableDouble = 3244.45; //no hace falta agregarle una letra al final
        System.out.println(variableDouble);

        //boolean - almacena solo dos valores posibles (true y false)
        boolean variableBoolean = true;
        System.out.println(variableBoolean);

        //char - ocupa 2 bytes y almacena un número entero que representa un caracter de la
        //tabla UNICODE
        //UNICODE es un standard de codificación de caracteres a nivel mundial
        char variableChar = 65;
        System.out.println(variableChar);
        //también se puede almacenar el caracter directamente
        variableChar = 'f'; //los caracteres se simbolizan encerrados entre comillas simples
        System.out.println(variableChar);

        //** String **
        //no es un tipo de dato primitivo, es una clase
        //representa una cadena de caracteres
        String variableString = "Hola a todos!";
        System.out.println(variableString);

        //tipos de datos var (inferencia de tipos)
        //aparecen a partir del JDK 10
        //No es un tipo de dato en sí mismo. Es una palabra que le indica al compilador
        //que infiera el tipo de dato a partir de la primera asignación de valor
        var var1 = 100;     //int
        var var2 = 'c';     //char
        var var3 = "c";     //String
        var var4 = true;    //boolean
        var var5 = 4.35f;   //float
        var var6 = 4.35;    //double
        //Este tipo de dato sólo puede ser usado en variables locales
        //no puede ser usado como parámetro de método ni como atributo de clase
        //no se puede declarar un var sin asignar un valor
        //no es un tipo dinámico
        //no se puede reasignar la variable a un tipo distinto luego.


        //concatenación de cadenas

        //operador de concatenación +
        String nombre = "Nahiara";
        System.out.println("Hola " + nombre); 

        //método String.format()
        //permite formatear cadenas de manera similar a printf de C
        int edad = 34;
        String mensaje = String.format("Hola, mi nombre es %s y tengo %d años", nombre, edad);
        System.out.println(mensaje);
        /*
         * marcadores de posición:
         * %s -> cadenas de texto
         * %d -> números enteros
         * %f -> números con decimales
         * %n -> saltos de línea
         */

        //Método System.out.printf()
        //se utiliza para imprimir directamente con formato
        System.out.printf("Hola, mi nombre es %s y tengo %d años", nombre, edad);
        System.out.println();

        //** Operadores **
        //Operadores aritméticos
        /*
         * + suma
         * - resta
         * * multiplicación
         * / división
         * % módulo o resto de la división
         * Son operadores binarios porque necesitan de dos operandos.
         * Los operandos son numéricos y el resultado es numérico
         */

        //Operadores de asignación
        /*
         * =    igual / asignación
         * +=   suma y asignación
         * -=   resta y asignación
         * *=   multiplicación y asignación
         * /=   división y asignación
         * %=   módulo y asignación
         * Son operadores binarios.
         * Asignan el valor a una variable y se la modifican utilizando una expresión
         */

        //Operadores incrementales y decrementales
        /*
         * ++   incremento en 1
         * --   decremento en 1
         * Puede utilizarse de dos formas:
         * - prefijo (++x o --x): La variable se modifica antes de que se use su valor en una expresión
         * - sufijo (x++ o x--): La variable se modifica después de que se use su valor en una expresión.
         */

        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        System.out.print(1);
        System.out.print(2);
        System.out.print(3);
        System.out.print(4);
        System.out.println(5);

        int coso = 1;
        System.out.println(coso);
        coso++;
        System.out.println(coso);
        System.out.println(coso++);
        System.out.println(coso);
        System.out.println(++coso);

        //Operadores relacionales
        /*
         * >    mayor
         * <    menor
         * >=   mayor o igual
         * <=   menor o igual
         * ==   igual
         * !=   distinto
         * Son operadores binarios.
         * Los operandos son numéricos el resultado es booleano.
         */

        //Operadores lógicos
        /*
         * &    AND (y lógico)
         * |    OR (o lógico)
         * !    NOT (negación)
         * Los operandos son booleanos y el resultado es booleano
         */

        /*
         * Un operador lógico en Java & o | evalúa ambas condiciones.
         * Al utilizar dos operadores && o || si con una condición determina el valor de verdad,
         * no evalúa las condiciones que siguen
         */



    }// final del método main
}// final de la clase
