/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurascondicionales;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class TotalFactura {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        
        double subtotal, total, descuento;
        int limite1, limite2;
        
        subtotal =0; total =0; descuento =0;
        limite1 = 200; limite2 = 500;
        
        System.out.println(" Programa para calcular el valor total de una factura con descuento ");
        
        // Ingresar datos de entrada
        System.out.println(" Ingrese el subtotal de la compra: ");
        subtotal = leer.nextDouble();
        
        // Proceso para saber el total de la compra
        
        if ((subtotal >= limite1)&&(subtotal < limite2)) {
            
            descuento = 0.10;
                      
        }
        
        else {
            if (subtotal >= limite2) {
                descuento = 0.15;
                
        }
            
        }
        
        total = subtotal -  (subtotal * descuento);
        
        // Presenta la salida de resultados
        System.out.println(" El total de la compra es " +total + " con un descuento de " + descuento);
        
    }
    
}
