/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Conversiones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        double M, C, K, PI, PU;
        
        // Lectura de datos
        
        System.out.println(" Ingresar el valor en metros");
        M = leer.nextDouble();
        
        // Proceso
        
        C = (M*100)/1;
        K = (M*1)/1000;
        PI = (M*1)/0.3048;
        PU = (M*39.37)/1;
        
        // Salida de resultados
        
        System.out.println("***Conversion de metros a centimetros, kilometros, pies y pulgadas***");
        System.out.println("El valor en centímetros es: " +C);
        System.out.println("El valor en kilómetros es: " +K);
        System.out.println("El valor en pies es: " +PI);
        System.out.println("El valor en pulgadas es: " +PU);
        
    }
    
}
