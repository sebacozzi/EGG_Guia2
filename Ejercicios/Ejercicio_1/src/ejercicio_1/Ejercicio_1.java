
package ejercicio_1;
    import java.util.Scanner;
public class Ejercicio_1 {
/*  Escribir un programa que pida dos números enteros por teclado y calcule la 
    suma de los dos. El programa deberá después mostrar el resultado de la suma
*/
    public static void main(String[] args) {
         //Creación de variables       
        int num1, num2; /// Almacenaje de números
        Scanner leer = new Scanner(System.in); /// Scanner de lectura de consola
        // Presentación
        System.out.println("Ingrese los números a sumar: ");
        // Lectura de números por teclado
        System.out.print("Número 1: ");
        num1= leer.nextInt();
        System.out.print("Número 2: ");
        num2= leer.nextInt();
        System.out.println("_______________________________");
        // Impresión de resultado de la suma
        System.out.println("La suma de los números es: " + (num1 + num2));
        //Mensaje de cierre del ejercicio
        System.out.println("#Fin del ejercicio 1 - Guia 2#");
    }
    
}
