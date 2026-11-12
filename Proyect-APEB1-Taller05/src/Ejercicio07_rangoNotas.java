import java.util.Scanner;
/**
 * Ejercicio 07: "Rango de Notas: Asignar una letra (A, B, C, D) a una 
 * calificación en función de su rango (A para 90-100, B para 80-89, etc.)."
 * @author Guaman Domenica
 * @version 1.0
 */
public class Ejercicio07_rangoNotas {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);        
        double nota;
        System.out.print("Ingrese su nota: ");
        nota = tcl.nextDouble();
        if (nota >= 90 && nota <= 100){
            System.out.println("CalificaciOn A");
        } else if (nota >= 80 && nota < 90){
                System.out.println("CalificaciOn B");
        }else if(nota >= 70 && nota < 80){
            System.out.println("Calificacion C");
        }else if(nota >= 60 && nota < 70){
            System.out.println("Calificacion D");
        }else
            System.out.println("Nota fuera de rango");
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese su nota: 60
Calificacion D
BUILD SUCCESSFUL (total time: 2 seconds)
 */