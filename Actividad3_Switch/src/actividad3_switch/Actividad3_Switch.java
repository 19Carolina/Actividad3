
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author carol
 */
public class Actividad3_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner reader = new Scanner(System.in); 
         System.out.println("-------Ejercicio 3-------");
         float num;
         
         System.out.println("Ingrese una hora cualquiera del día");
         num = reader.nextInt();
         
         switch (num) {
            case 6.30:
            System.out.println("Me despierto");
            break;
            case 9. 00:
            System.out.println("Estoy en clases");
            break;
            case 3.30: 
            System.out.println("Almuerzo");
            break;
            case 5.30:
                System.out.println("Me baño");
            break;
            case 7.00: 
                System.out.println("Tomo clases de LP");
            break;
            case 9.30:
                System.out.println("Ceno");
                break;
            case 11.30:
                System.out.println("Me voy a dormir");
            default:
                System.out.println("Indeterminado");
    }
    
}
