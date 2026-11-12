import java.util.Scanner;
/**
 * Ejercicio 11: "Pedidos online: Desarrollar una solución que imprima el costo
 * de un pedido de un artículo del cual se tiene la descripción, la cantidad
 * que se requiere y el precio unitario. Si la cantidad pedida excede de 50 
 * unidades, se hace un descuento de 15%."
 * @author Guaman Domenica
 * @version 1.0
 */
public class Ejercicio11_pedidosOnline {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);        
        String descripcion;
        int cantidad;
        double precio, subtotal, descuento, total;
        System.out.print("Ingrese la descripcion del articulo: ");
        descripcion = tcl.nextLine();
        System.out.print("Ingrese la cantidad solicitada: ");
        cantidad = tcl.nextInt();
        System.out.print("Ingrese el precio unitario: ");
        precio = tcl.nextDouble();
        subtotal = cantidad*precio;
        descuento=0;
        if (cantidad >50){
            descuento = subtotal*0.15;
        }
        total =subtotal-descuento;
        System.out.println("Artículo: "+descripcion);
        System.out.println("Precio: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Descuento: "+descuento);
        System.out.println("Total: "+total);
    }
}
/***
 * EVIDENCIA DEL RUN:
 * run:
Ingrese la descripcion del articulo: lapices
Ingrese la cantidad solicitada: 60
Ingrese el precio unitario: 0,50
Articulo: lapices
Precio: 0.5
Cantidad: 60
Subtotal: 30.0
Descuento: 4.5
Total: 25.5
BUILD SUCCESSFUL (total time: 11 seconds)
 */