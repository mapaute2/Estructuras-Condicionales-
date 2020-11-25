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
public class PositivoNegativo {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        
        int n = 0;
        String Tipo = "";
        
        System.out.println(" Programa para saber cuando un número es positivo o negativo ");
        
        // Ingresar datos de entrada
        
        System.out.println(" Ingrese un número diferente a cero ");
        n = leer.nextInt();
        
        // Proceso
        
        if (n > 0){
            System.out.println(" El número " +n+ " es positivo ");
        }
        else {
            System.out.println(" El número " +n+ " es negativo ");
        }
        
        
    }
}
