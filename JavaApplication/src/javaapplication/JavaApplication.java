/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Arrays;


public class JavaApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] staff = {"Simon","Jane", "David", "Eutecus","Peter", "Gerald"};
        
        System.out.println(staff);// String Object Memory Address
        
        int[] digit = {1,2,3,4,5,6};

        int[] alpa = new int[3];

        System.out.println("It is an array memory "+alpa+" and content is "+ Arrays.toString(alpa));


        for (var i = 0; i < digit.length; i++) {
            var each = digit[i];

            System.out.println(each);
            
        }
        
        System.out.println(digit);// int memory address
        
        System.out.println(Arrays.toString(digit));
        
        System.out.println(Arrays.toString(staff));
        
        
    }
    
}
