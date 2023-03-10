
package ejercicio_4;

/**
 * Dada una cantidad de grados centígrados 
 * se debe mostrar su equivalente en grados Fahrenheit.
 * La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
import java.util.Scanner;
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definición de variables
        float C;
        float F;
        Scanner leer = new Scanner(System.in);
        // Solicita los grados en centigrados
        System.out.print("Ingrese los grados centigrados: ");
        C= leer.nextFloat();        
        F= 32+(9*C/5);
        System.out.println("En fahrenheit es: "+ F);
    }
    
}
