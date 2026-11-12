import java.util.Scanner;
/**
 * Ejercicio 01: "Edad para Votar: Determinar si una persona es elegible para
 * votar en función de su edad (mayor o igual a 16 años)."
 * @author Guaman Domenica y Macas Katherin
 * @version 1.0
 */
public class Ejercicio01_EdadVotar {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);    
        int edad;
        System.out.println("Ingrese la edad: ");
        edad = tcl.nextInt();
        if (edad >=16){
        System.out.println("Legible para votar");
        }else 
            System.out.println("Edad no legible para votar");
    }
        
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la edad
18
Legible para votar
BUILD SUCCESSFUL (total time: 4 seconds)

 */