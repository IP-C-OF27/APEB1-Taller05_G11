import java.util.Scanner;
/**
 * Ejercicio 13: "Sistema de reservas hoteleras: En una hostería de la ciudad
 * de Loja se hace un descuento del 10% si el cliente se hospeda más de 5 días, 
 * del 15% si se hospeda más de 10 días y del 20% si se hospeda más de 15 días.
 * Elaborar una solución que pida el número de días y el precio diario de la 
 * habitación y luego calcule e imprima el subtotal por pagar, el descuento y
 * el total por pagar."
 * @author Guaman Domenica y Macas Katherin
 * @version 1.0
 */
public class Ejercicio13_reservaHotel {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        int dias;
        double precioDiario, subtotal,descuento, total ;
        System.out.println("Ingrese el numero de dias: ");
        dias = teclado.nextInt();
        System.out.println("Ingrese el precio diario de la habitación: ");
        precioDiario= teclado.nextDouble();
        subtotal = dias * precioDiario;
        if (dias > 15) {
            descuento = subtotal * 0.20;
        }else if (dias > 10) {
            descuento = subtotal * 15;
        } else if (dias > 5) {
            descuento = subtotal * 0.10;
        }else {
            descuento = 0;
        }
        total = subtotal - descuento;
        System.out.println("Subtotal por pagar: $" + subtotal);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total por pagar: $" + total);
        }
        
    }


/***
 * EVIDENCIA DEL RUN:
compile-single:
run-single:
Ingrese el numero de dias: 
5
Ingrese el precio diario de la habitación: 
25
Subtotal por pagar: $125.0
Descuento: $0.0
Total por pagar: $125.0
BUILD SUCCESSFUL (total time: 26 seconds)
*/