package ar.com.centro8.java.com.poo_ejercicio_01.entidades.keywords;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Getter //no ponemos el setter porque es final, no se cambia es constante 
@RequiredArgsConstructor //cuando es final o nonull 
@ToString
public class Automovil {

    //La keyword final a nivel atributo o variable determina que es una constante 
    private final String marca;
    private final String modelo;
    private final String color;
    private static int velocidad;

/*
 * final: cuando un atributo es declarado como final, queda constante 
 * No se puede modificar su valor.
 * A nivel de clase, la keyword final, indica que esa clase no puede tener clases hijas.
 */

 /*
  * static 
  * Cuando un atributo es estatico, pertenece a la clase, ya que solo existe una copia 
  * Se accede a un atributo estático directamente a través del nombre de la clase.   
  */

  /*
   * Cuando un método es estático significa que ese método pertenece a la clase. 
   * Si el atributo que se modifica es estático, el metodo debe ser estático
   * No podemos utilizar el this. porque eso hace referencia al objeto, y el atributo no estático no 
   * pertenece al objeto en si mismo
   */

   public static void acelerar(int kilometros) {
    velocidad += kilometros;        //metodos que modifican sin necesitar el getter 
   }

   public static void frenar(int kilometros){
    if (velocidad-kilometros<0)velocidad=0; // un setter controlado, no es setter son metodos que modifican la velocidad
    else velocidad -= kilometros;
   }

    /*
     * Desde un método estático, solo puedo hacer referencia a atributos estáticos de la clase.
     * Desde un método no estático, puedo llamar a miembros estáticos y no estáticos.
     * Métodos estáticos:
     *      Pertenecen a la clase y no tiene acceso al contexto de instancia (no existe el this.).
     *      Por ello, dentro de un método estático sólo se puede referenciar a otros miembros
     *      estáticos de la clase.
     * Métodos no estáticos (de instancia):
     *      Pertenecen a una instancia específica de la clase y, por lo tanto, tienen acceso
     *      tanto a los miembros estáticos (que son compartidos por la clase) como a los miembros
     *      no estáticos (propios de la instancia).
     */

    public static int getVelocidad(){
    return velocidad;
    }
}
