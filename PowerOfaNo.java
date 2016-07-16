/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofano;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class PowerOfaNo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the number and its power:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int power=sc.nextInt();
        System.out.println("the result is:"+Math.pow(num, power));
    }
}
