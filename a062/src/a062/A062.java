/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a062;

/**
 *
 * @author dnceg
 */
public class A062 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // create a Factorial object
        Factorial factorial = new Factorial();

        // obtain an integer from the console
        int myint = factorial.getInt();

        // calculate the factorial of the number
        System.out.println("Factorial of " + myint + " is: " + factorial.calc_factorial(myint));    
    
    }
}
