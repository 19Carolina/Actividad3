/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial054786;

/**
 *
 * @author carol
 */
public class Factorial054786 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial1 = 1;
        int num = 5;
        
        while (num != 0) {
            factorial1 = factorial1*num;
            num++;
        }
        System.out.println("El factorial es: " + factorial1);
    }
    
}
