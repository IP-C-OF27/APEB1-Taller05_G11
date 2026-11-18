
import java.util.Scanner;

/**
 * Ejercicio 04:  Descuento en Compras: Calcular el precio final de un producto con un descuento del 10% si el precio original es mayor de $100; de lo contrario, no hay descuento.
 * @author Guaman Domenica y Macas Katherin
 * @version 1.0
 */
public class Ejercicio04_Descuento {
       //Aqui agrege todo su codigo...
        public static void main(String[] args) {
        double precio, factura ;
        Scanner tcl = new Scanner(System.in);
        System.out.println("Deme precio: ");
        precio= tcl.nextDouble();
        factura = precio ;
        if (precio > 100)
           // factura = precio - (10 / 10 );
            factura = precio *= 0.9;
        System.out.println(precio);
             }
        
    
    }
    
    
/***
 * EVIDENCIA DEL RUN:
compile-single:
run-single:
Deme precio: 
45
45.0
BUILD SUCCESSFUL (total time: 7 seconds)
*/
