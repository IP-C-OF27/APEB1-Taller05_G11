import java.util.Scanner;
/**
 * Ejercicio 09: "Ordenamiento de Tres Números: Dados tres números, ordenarlos 
 * en orden ascendente."
 * @author Guaman Domenica
 * @version 1.0
 */
public class Ejercicio09_ordenarNumeros {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);        
        int num1, num2, num3, auxi;
        System.out.print("Ingrese el primer numero: ");
        num1 = tcl.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        num2 = tcl.nextInt();
        System.out.print("Ingrese el tercer numero: ");
        num3 = tcl.nextInt();
        if (num1 > num2){
            auxi = num1;
            num1 = num2;
            num2 = auxi;
        }
        if (num1 > num3){
            auxi = num1;
            num1 = num3;
            num3 = auxi;
        }
        if (num2 > num3){
            auxi = num2;
            num2 = num3;
            num3 = auxi;
        }
        System.out.println("En orden ascendente: "+num1+", "+ num2+", "+num3);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese el primer numero: 40
Ingrese el segundo numero: 78
Ingrese el tercer numero: 5
En orden ascendente: 5, 40, 78
BUILD SUCCESSFUL (total time: 5 seconds)
 */