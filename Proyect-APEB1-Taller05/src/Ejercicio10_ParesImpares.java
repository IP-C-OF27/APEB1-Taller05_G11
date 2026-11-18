
import java.util.Scanner;

/**
 * Ejercicio 10:  Valores pares o impares: Dado un valor entero ingresado por 
 * teclado (positivo o negativo), determinar si se trata de un valor par o 
 * impar.
 * @author Guaman Domenica y Macas Katherin
 * @version 1.0
 */
public class Ejercicio10_ParesImpares {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int numero;
        System.out.println("Ingrese un valor: ");
        numero = tcl.nextInt();
        if (numero % 2 == 0) {
        System.out.println("El numero es par");
    } else {
            System.out.println("El numero es impar");
            }
            }
    }
    

