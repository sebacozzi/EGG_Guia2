
package ejercicio_5;

/**
 * Escribir un programa que lea un número entero por teclado y 
 * muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
 * Nota: investigar la función Math.sqrt().
 */
import java.util.Scanner;
public class Ejercicio_5 {

    public static void main(String[] args) {
        // Declaración de variables
        int num;
        Scanner leer = new Scanner(System.in);
        // Ingreso de Datos
        System.out.print("Ingrese un número: ");
        num = leer.nextInt();
        // Mostrar los resultados
        System.out.println("El doble del número es :" + (num * 2));
        System.out.println("El doble del número es :" + (num * 3));
        System.out.println("El doble del número es :"+ Math.sqrt(num));
    }
    
}
