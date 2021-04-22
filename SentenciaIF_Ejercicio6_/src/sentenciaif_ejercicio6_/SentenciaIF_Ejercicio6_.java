/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sentenciaif_ejercicio6_;

import javax.swing.JOptionPane;

/**
 *
 * @author carol
 */
public class SentenciaIF_Ejercicio6_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("-------EJERCICIO 6--------");
        
       int Num; 
        Num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una "
                + "cantidad"));
         
        if (Num < 10 ) {
            JOptionPane.showMessageDialog(null, "La cantidad " + Num 
                    +  " tiene una cifra");
        }else if (Num < 100 ) {
            JOptionPane.showMessageDialog(null,  "La cantidad " + Num 
                    +  " tiene dos cifras");
        } else 
    }
    
}
