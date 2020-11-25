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
public class Calculadora {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Se declaran e inicalizan las variables 
        double num1, num2, respuesta;
        int opcion;
        
        num1 = 0; num2 = 0; respuesta = 0; opcion = 1;
        
        System.out.println(" Calculadora de operaciones básicas \n");
        
        System.out.println(" Ingrese el valor del número 1");
        num1 = leer.nextDouble();
        System.out.println(" Ingrese el valor de numero 2");
        num2 = leer.nextDouble();
        
        // Escriba el menú de opciones en pantalla
        
        System.out.println(" Escoja una de las siguientes opciones");
        System.out.println(" 1. Suma");
        System.out.println(" 2. Resta");
        System.out.println(" 3. Multiplicación");
        System.out.println(" 4. División");
        
        // Se ingresa la opción
        opcion = leer.nextInt();
        
        
        // Se realiza la calculadora con las operaciones básicas
        
        switch (opcion){
            case 1: {
                respuesta = num1 + num2;
                System.out.println(" La suma es: " +respuesta);
            }
            break;
            case 2: {
                respuesta = num1 - num2;
                System.out.println(" La resta es: " +respuesta);
            }
            break;
            case 3: {
                respuesta = num1 * num2;
                System.out.println(" La multiplicación es: " +respuesta);
            }
            break;
            case 4: {
                respuesta = num1 / num2;
                System.out.println(" La división es: " +respuesta);
            }
            break;
            default:
                System.out.println(" Opción inválida ");
            break;    
        }
                
    }
    
}
