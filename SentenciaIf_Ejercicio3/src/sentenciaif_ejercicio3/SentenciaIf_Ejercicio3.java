/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif_ejercicio3;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class SentenciaIf_Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in); 
        
        System.out.println("-------EJERCICIO 3--------");
        int Num1; 
        int Num2;
        
        System.out.println("Ingrese un número");
        Num1 = reader.nextInt();
        
        System.out.println("Ingrese un número");
        Num2 = reader.nextInt();
        
        if (Num1 > Num2){
            System.out.println(Num1 + " es mayor que " + Num2);
        } else if (Num1 < Num2) { 
            System.out.println(Num2 + " es mayor que " + Num1);
        } else if (Num2 > Num1) {
            System.out.println(Num1 + " es menor que " + Num2);
        } else if (Num2 < Num1) {
            System.out.println(Num2 + " es menor que " + Num1);
        } else if (Num1 == Num2) 
            System.out.println(Num1 + " es igual a " + Num2);
    }
    
}
