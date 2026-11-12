import java.util.Scanner;
/**
 * Ejercicio 06: "Categoría de Edad: Clasificar a una persona en una categoría
 * de edad (niño, adolescente, adulto) en función de su edad."
 * @author Guaman Domenica
 * @version 1.0
 */
public class Ejercicio06_categoriaEdad {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);        
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = tcl.nextInt();
        if (edad >= 0 && edad <= 11){
            System.out.println("Niño");
        } else if (edad >= 12 && edad<=17){
            System.out.println("Adolescente");
        }else if (edad >= 18 && edad <=110){
            System.out.println("Adulto");
        }else{
            System.out.println("Edad no válida");
        } 
    }
}
/***
 * run:
Ingrese su edad: 11
Ni�o
BUILD SUCCESSFUL (total time: 2 seconds)

 */
