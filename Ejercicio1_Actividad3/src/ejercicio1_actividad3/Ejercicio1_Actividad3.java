/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_actividad3;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Ejercicio1_Actividad3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num = 0;
        int suma = 0;
        Scanner ent = new Scanner(System.in);
         
        while(num < 11) {
            num++;
             
            suma += ent.nextInt();
            
        }
         
        System.out.println("La suma total es: "+suma);
    }
    }
    
}
