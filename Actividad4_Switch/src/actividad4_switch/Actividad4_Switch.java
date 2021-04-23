/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad4_switch;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Actividad4_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in); 
         System.out.println("-------Ejercicio 4-------");
       
         boolean Dias = true;;
        if(Dias == true)   {
             System.out.println("Semana Inglesa");
            int dia;
            dia= reader.nextInt();
            switch (dia){
            case 1:
                 System.out.println("Domingo");
                break;
            case 2:
                 System.out.println("Lunes");
                break;    
            case 3:
                 System.out.println("Martes");
                break;    
            case 4:
                 System.out.println("Miércoles");
                break;   
            case 5:
                 System.out.println("Jueves");
                break;    
            case 6:
                 System.out.println("Viernes");
                break;   
            case 7:
                 System.out.println("Sábado");
                break;       
        }} else {
            System.out.println("Semana Laboral");
            int diaX;
        diaX= reader.nextInt();
            switch (diaX){
            case 1:
                 System.out.println("Lunes");
                break;
            case 2:
                 System.out.println("Martes");
                break;    
            case 3:
                 System.out.println("Miércoles");
                break;    
            case 4:
                 System.out.println("Jueves");
                break;   
            case 5:
                 System.out.println("Viernes");
                break;    
            case 6:
                 System.out.println("Sábado");
                break;   
            case 7:
                 System.out.println(" Domingo ");
                break;      
    }
    
}
