import java.util.Scanner;
/**
 * Ejercicio 03: "Mayor de tres números: Dados tres números distintos,
 * determinar cuál es el mayor."
 * @author Guaman Domenica
 * @version 1.0
 */
public class Ejercicio03_mayorNumero{
    public static void main(String[] args) {
    Scanner tcl = new Scanner(System.in);    
    double num1, num2, num3;
        System.out.print("Primer numero: ");
        num1 = tcl.nextDouble();
        System.out.print("Segundo numero: ");
        num2 = tcl.nextDouble();
        System.out.print("Tercer numero: ");
        num3 = tcl.nextDouble();
        if (num1 > num2 && num1 > num3){
            System.out.println("El mayor es: " + num1);
        }else if (num2 > num1 && num2 > num3){
            System.out.println("El mayor es: " + num2);
        }else {
            System.out.println("El mayor es: " + num3);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Primer numero: 15
Segundo numero: 8
Tercer numero: 3
El mayor es: 15.0
 */