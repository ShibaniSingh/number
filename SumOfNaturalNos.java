/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofnaturalnos;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class SumOfNaturalNos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("ENTER THE NUMBER:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("the sum of first"+n+ " natural nos is"+sum);
    }
}
