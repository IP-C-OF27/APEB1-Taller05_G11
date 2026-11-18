
import java.util.Scanner;

/**
 * Ejercicio 12:  Calculo de impuestos: Desarrollar una solución que permita 
 * leer los datos de un automóvil (marca, origen y costo) imprima el impuesto 
 * por pagar y el precio de venta (incluido el impuesto). Si el origen es 
 * Alemania el impuesto es 20%, si es de Japón el impuesto es 30%, si es de 
 * Italia, 15%, y si es de USA, 8%
 * @author Guaman Domenica y Macas Katherin
 * @version 1.0
 */
public class Ejercicio12_Impuestos {
    public static void main(String[] args) {      

        Scanner tcl = new Scanner(System.in);
        String marca, origen;
        double impuesto, costo, total;
        System.out.println("Ingresar la marca del auto");
        marca = tcl.nextLine();
        System.out.println("Ingresar el origen del auto, Alemania, Japon, Italia, Usa");
        origen = tcl.nextLine();
        System.out.println("Ingresar el costo del auto");
        costo = tcl.nextDouble();
        impuesto = 0;
        switch (origen) {
            case "Alemania":
                impuesto = costo * 0.20;
                break;
            case "Japon":
                impuesto = costo * 0.30;
                break;
            case "Italia":
                impuesto = costo * 0.15;
                break;
            case "Usa":
                impuesto = costo * 0.08;
                break;
            default:
                System.out.println("Origen no válido");
        }
        total = impuesto + costo;
        System.out.println("La marca del auto es: " + marca);
        System.out.println("El impuesto es: " + impuesto);
        System.out.println("El precio de venta es: " + total);
    }
}
   
/***
 * EVIDENCIA DEL RUN:
compile-single:
run-single:
Ingresar la marca del auto
chevrolet
Ingresar el origen del auto, Alemania, Japon, Italia, Usa
alemania
Ingresar el costo del auto
45
Origen no válido
La marca del auto es: chevrolet
El impuesto es: 0.0
El precio de venta es: 45.0
BUILD SUCCESSFUL (total time: 21 seconds)
*/