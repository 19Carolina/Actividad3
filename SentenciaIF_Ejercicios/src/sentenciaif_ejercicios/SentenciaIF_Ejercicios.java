/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif_ejercicios;

import java.util.Scanner;

/**
 *
 * @author carol
 */

public class SentenciaIF_Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Primer Ejercicio 
        System.out.println("-------EJERCICIO 1--------");
        Scanner reader = new Scanner(System.in);                
        int Numero1; 
        int Numero2;
        
        System.out.println("Dame el primer número");
        Numero1 = reader.nextInt();
        
        System.out.println("Dame el segundo número");
        Numero2 = reader.nextInt();
        
        if (Numero1 > Numero2)
            System.out.println(Numero1 + " es mayor que " + Numero2);
        else
            System.out.println(Numero2 + " es mayor que " + Numero1);
        
        
        
    }
    
