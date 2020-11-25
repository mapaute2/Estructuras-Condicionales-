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
public class NumeroMayor {
    
    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables 
        
        int N1, N2, N3, Mayor, Menor;
        String Tipo;
        
        N1 = 0; N2 = 0; N3 = 0; Mayor = 0; Menor = 0;
        Tipo =""; 
        
        System.out.println(" Programa para saber el mayor de tres números en estructura condicional simple ");
        
        // Ingresar los datos de entrada
        
        System.out.println(" Ingrese tres números diferentes ");
        
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        N3 = leer.nextInt();
        
        // Proceso 
        
        if ((N1 > N2)&&(N1 > N3)) {
            System.out.println(" El número " +N1 + " es mayor");
        }
        if ((N2 > N3)&&(N2 > N1)){
            System.out.println(" El número " +N2 + " es mayor");
        }
        if ((N3 > N2)&&(N3 > N1)){
            System.out.println(" El número " +N3 + " es mayor");
        }
   
        
        System.out.println(" Programa para saber el mayor de tres número en estructura condicional compuesta ");
       
        // Ingresar los datos de entrada
        
        System.out.println(" Ingrese tres números diferentes ");
        
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        N3 = leer.nextInt();
        
        // Proceso
        
        if ((N1 > N2)&&(N1 > N3)){
            Tipo = "Mayor"; 
            System.out.println(" El " +N1+ " es " +Tipo); 
        }
        else{
            Tipo = "Menor"; 
        }
    
        if ((N2 > N3)&&(N2 > N1)){
            Tipo = "Mayor";
            System.out.println(" El " +N2+ " es " +Tipo);
        }
        else{
            Tipo = "Menor";
        }
        
        
        if ((N3 > N2)&&(N3 > N1)){
            Tipo = "Mayor"; 
               System.out.println(" El " +N3+ " es " +Tipo);
        }
        else{
            Tipo = "Menor";
        }
        
        System.out.println(" Programa para saber el mayor de tres número en estructura condicional anidada ");
       
        // Ingresar los datos de entrada
        
        System.out.println(" Ingrese tres números diferentes ");
        
        N1 = leer.nextInt();
        N2 = leer.nextInt();
        N3 = leer.nextInt();
        
        // Proceso
        
        if (N1 > N3){
            if (N1 > N2){
                Mayor = N1;
                System.out.println(" El " +N1+ " es Mayor");
            }
        }
        if (N2 > N1){
            if (N2 > N3){
                Mayor = N2;
                System.out.println(" El " +N2+ " es Mayor");  
            }   
        }        
        if (N3 > N1){
            if (N3 > N2){
                Mayor = N3;
                System.out.println(" El " +N3+ " es Mayor");   
            }
        }
         
      }
    }
  

