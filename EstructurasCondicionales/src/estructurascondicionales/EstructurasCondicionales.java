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
public class EstructurasCondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // El número a verificar
        int n = 0;
        
        System.out.println(" Programa para verificar si un número es par \n");
        
        System.out.println(" Ingrese el número a verificar");
        
        n = leer.nextInt(); //Ingresa el número
        
        if (n%2 ==0){
            
            System.out.println(" El número" +n+ "es par");
        
        }
                
                
        
      
        
 
        
    }
    
}
