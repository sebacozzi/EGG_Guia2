
package ejercicio_3;

/**
 *Escribir un programa que pida una frase y la muestre 
 * toda en mayúsculas y después toda en minúsculas. 
 * Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 * 
 */
import java.util.Scanner;

public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creación de variables
        String Frase;
        Scanner leer= new Scanner(System.in);
        // Solicitud de frase
        System.out.print("Ingrese un frase :");
        Frase= leer.nextLine();
        System.out.println("_______________________________");
        System.out.println("La frase original es: " + Frase);
        // Impresión de resultado mayusculas
        System.out.println("La frase en mayusculas quedaria así: " + Frase.toUpperCase());
        System.out.println("");
        // Impresión de resultado minusculas
        System.out.println("La frase en mayusculas quedaria así: " + Frase.toLowerCase());
        //Mensaje de cierre del ejercicio
        System.out.println("#Fin del ejercicio 3 - Guia 2#");
    }
    
}
