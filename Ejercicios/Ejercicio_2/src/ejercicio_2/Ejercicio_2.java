package ejercicio_2;

/**
    Escribir un programa que pida tu nombre, lo guarde en una variable 
    y lo muestre por pantalla.
 */

import java.util.Scanner;

public class Ejercicio_2 {
    
    public static void main(String[] args) {
        String nombre;
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        nombre = leer.nextLine();
        System.out.println("_______________________________");
        // Impresión de mensaje + nombre ingresado
        System.out.println("Su Nombre es : " + nombre);
        //Mensaje de cierre del ejercicio
        System.out.println("#Fin del ejercicio 2 - Guia 2#");
    }
    
}
