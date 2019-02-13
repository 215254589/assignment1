package com.chad.assignment1;

import java.util.Scanner;

/**
 *
 * @author Chad Boswell
 */

public class SimpleProgram {
static Scanner input=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here

        int     num1,num2,num3;
        System.out.println("Enter a value");
        num1=input.nextInt();
        System.out.println("Enter a 2nd value");
        num2=input.nextInt();
        System.out.println("Enter 3rd value");
        num3=input.nextInt();
                System.out.println("Largest number finder");
        if(num1> num2 && num1 > num3)
        {
            System.out.println(num1+ " is the largest number");
        }

        else if(num2> num1 && num2 > num3)
        {
            System.out.println(num2+ " is the largest number");
        }

        else
        {
            System.out.println(num3+ " is the largest number");
        }
            System.out.println("From the values:"+num1+","+num2+","+num3);
    }

}