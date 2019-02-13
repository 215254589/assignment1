package com.chad.assignment1;

/**
 *
 * @author Chad Boswell
 */
public class SimpleProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here

        int     num1= 4,
                num2= 7,
                num3= 6;

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

    }

}