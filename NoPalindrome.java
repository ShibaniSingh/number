/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nopalindrome;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class NoPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the no:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d,reverse=0;
        int n1=n;
        while(n1>0)
        {
            d=n1%10;
            reverse=reverse*10+d;
            n1=n1/10;
        }
        if(reverse==n)
        {
            System.out.println("tne no is a palindrome");
        }
        else
        {
            System.out.println("the no is not a palindrome");
        }
    }
}
