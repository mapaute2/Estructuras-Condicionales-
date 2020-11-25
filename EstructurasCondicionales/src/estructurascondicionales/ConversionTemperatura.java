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
public class ConversionTemperatura {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaracion de variables
        double gC, gF, gK;
        
        // Inicializacion de variables 
       
        gC = 0; gF = 0; gK = 0;
      
        System.out.println(" Programa para transformar de grados centigrados" +"a grados Farenheit y a grados Kelvin \n");
        
        System.out.println(" Ingrese los grados centigrados");
        gC = leer.nextDouble();
        
        // Condición para convertir de grados a temperatura
        
        if (gC > 0) {
            gF = (gC * 9/5)+32;
            gK = (gC + 273.75);
            
            System.out.println(" La equivalencia en grados F es: "+gF);
            System.out.println(" La equivalencia en grados K es: "+gK);
            
    }
       
    }
    
}
