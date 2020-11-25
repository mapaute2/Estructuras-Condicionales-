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
public class ConversionHora {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        // Declaración e inicialización de variables
        int h24, m24, h12, m12;
        String periodo;
        
        h24 = 0; m24 = 0; h12 = 0; m12 = 0;
        periodo = "a.m.";
        
        System.out.println(" Programa para convertir las horas en formato de 24 a 12 horas \n");
        
        // Ingresar los datos de entrada
        
        System.out.println(" Ingrese la hora en formato 24 a transformar ");
        h24 = leer.nextInt();
        
        System.out.println(" Ingrese los minutos a transformar");
        m24 = leer.nextInt();
        
        if ((h24 < 24)&&(h24 > 0)){ 
           
           if ((h24 >= 0)&&(h24 <= 24)&&(m24 >= 0)&&(m24<=60)) {
                if (m24==60){
                   h24 = h24 + 1;
                   m24 = 0;                
                }
                else{     
                    m12 = m24;
                }
                if (h24 >= 12){
                    
                    if (h24 == 12){
                        h12 = h24;
                    }
                    else {
                        h12 = h24 - 12;
                    }
                    periodo = "p.m.";
                }
            
                System.out.println(" El tiempo de " +h24 +" horas y " +m24 +" minutos, en formato de 24 horas ");
                System.out.println(" Equivale a " +h12 +" horas y " +m12 +" minutos" + periodo );
           }
                   
        }
        else {
            if (h24 == 0){
                h12 = h24;
                if (m24 == 60){
                    h12 = h12 + 1;
                    m24 = 0;
                }
                else{
                    m12 = m24;
                }
                System.out.println(" El tiempo de " +h24 +" horas y " +m24 +" minutos, en formato de 24 horas ");
                System.out.println(" Equivaqales a " +h12 +" horas y "+m12 +" minutos "+periodo);          
            }
            else {
                if (h24 == 24){
                    h12 = 0;
                    if (m24 == 60){
                        h12 = h12 + 1;
                        m24 = 0;
                    }
                    else {
                        m12 = 24;
                    }
                    System.out.println(" El tiempo de "+h24 +" horas y " +m24 +" minutos, en formato de 24 horas ");
                    System.out.println(" El equivalente a " +h12 +" horas y " +m12 +" minutos "+periodo);
                }
            }
        }  
}
}
