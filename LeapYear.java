/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package leapyear;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the year:");
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
          System.out.println(year+" is not a leap year");  
        }
    }
}
