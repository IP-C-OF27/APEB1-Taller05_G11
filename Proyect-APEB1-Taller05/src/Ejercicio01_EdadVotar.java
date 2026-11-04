import java.util.Scanner;
/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Guaman Domenica y Macas Katherin
 * @version 1.0
 */
public class Ejercicio01_EdadVotar {
    //AQUÍ AGREGUE TODO SU CÓDIGO...
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);    
        int edad;
        System.out.println("Ingrese la edad");
        edad = tcl.nextInt();
        if (edad >=16){
        System.out.println("Legible para votar");
        }else 
            System.out.println("Edad no legible para votar");
    }
        
}
/***
 * EVIDENCIA DEL RUN:
 * Pegue aquí la evidencia de la ejecución del .java
 */