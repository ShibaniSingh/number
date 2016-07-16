/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package countingdigits;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class CountingDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int digit=0;
        System.out.println("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0)
        {
            n=n/10;
            digit=digit+1;
        }
        System.out.println("the number of digits in an integer "+n+ " is "+digit);
    }
}
