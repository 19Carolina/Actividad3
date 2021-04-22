/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif_ejercicio5;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class SentenciaIf_Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in); 
        System.out.println("-------EJERCICIO 5--------");
        
        int Num1;
    
        
        System.out.println("Ingrese un número");
        Num1 = reader.nextInt();
        
        System.out.println("Resultado: ");
        if (Num1 >= 0)
            System.out.println(Num1 + " es positivo");
        else 
        if (Num1 < 0) 
            System.out.println(Num1 + " es negativo");
        else 
        
    }
    

