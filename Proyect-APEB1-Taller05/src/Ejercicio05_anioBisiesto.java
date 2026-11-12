import java.util.Scanner;
/**
 * Ejercicio 05: "Año Bisiesto: Comprobar si un año ingresado es bisiesto o no. 
 * Si es bisiesto, mostrar un mensaje especial."
 * @author Guaman Domenica
 * @version 1.0
 */
public class Ejercicio05_anioBisiesto {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);        
        int anio;
        System.out.println("Ingrese el anio: ");
        anio = tcl.nextInt();
        if ((anio % 400 == 0)||(anio % 4 == 0 && anio % 100 != 0)){
            System.out.println("Es bisiesto");
        }else {
            System.out.println("No es bisiesto");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el anio: 
2025
No es bisiesto
BUILD SUCCESSFUL (total time: 2 seconds)

 */