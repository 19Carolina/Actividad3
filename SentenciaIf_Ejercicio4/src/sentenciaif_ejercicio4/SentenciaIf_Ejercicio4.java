/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif_ejercicio4;
import java.util.Scanner;

/**
 *
 * @author carol
 */
public class SentenciaIf_Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in); 
        
         System.out.println("-------EJERCICIO 4--------");
        
        int Año1; 
        int Año2;
        int Resultado;
        int Respuesta;
        System.out.println("Ingrese el año actual");
        Año1 = reader.nextInt();
        
        System.out.println("Ingrese un año cualquiera");
        Año2 = reader.nextInt();
        
        if (Año1 > Año2){
            Resultado = Año1 - Año2;
            System.out.println("Han pasado " + Resultado + " años");
        } else if (Año2 > Año1) {
            Respuesta = Año2 - Año1;
            System.out.println ("Faltan " + Respuesta + " años");
        }
    }
    
}
