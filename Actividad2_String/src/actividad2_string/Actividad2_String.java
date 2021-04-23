/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad2_string;

import java.util.Scanner;

/**
 *
 * @author carol
 */
public class Actividad2_String {



    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int opcion;
      Scanner leer = new Scanner (System.in);
      
      System.out.println("1. Correr");
      System.out.println("2. Saltar");
      System.out.println("3. Dormir");
      System.out.println("4. Comer");
      System.out.println("5. Estudiar");
      
      System.out.println("Eliga una opción del menú: ");
      opcion = leer.nextInt();
      
      switch (opcion) {
          case 1:
              System.out.println("Seleccionaste Correr");
              break;
          case 2:
              System.out.println("Seleccionaste Saltar");
              break;
          case 3:
              System.out.println("Seleccionaste Dormir");
              break;
          case 4:
              System.out.println("Seleccionaste Comer");
              break;
          case 5:
              System.out.println("Seleccionaste Estudiar");
              break;
          default:
                System.out.println("Indeterminado");
          
      }
      
      
    }
    
}
