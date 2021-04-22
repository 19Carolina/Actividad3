/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif_ejercicio2;
import java.util.Scanner;
/**
 *
 * @author carol
 */
public class SentenciaIf_Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner reader = new Scanner(System.in);
         System.out.println("-------EJERCICIO 2--------");
        int Entero1; 
        int Entero2;
        
        System.out.println("Dame el primer número entero");
        Entero1 = reader.nextInt();
        
        System.out.println("Dame el segundo número entero");
        Entero2 = reader.nextInt();
        
        if (Entero1 > Entero2){
            System.out.println(Entero1 + " es mayor que " + Entero2);
        } else if (Entero1 < Entero2) { 
            System.out.println(Entero2 + " es mayor que " + Entero1);
        } else if (Entero2 > Entero1) {
            System.out.println(Entero1 + " es menor que " + Entero2);
        } else if (Entero2 < Entero1) 
            System.out.println(Entero2 + " es menor que " + Entero1);
         else 
    }
    
}
