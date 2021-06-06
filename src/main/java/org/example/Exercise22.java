/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.util.Scanner;
class Nums
{
    int num1;
    int num2;
    int num3;
    int large;
}
public class Exercise22
{
    public static void main( String[] args )
    {
        Nums n = new Nums();
        n = inputs(n);
        System.out.println("The largest number is " + n.large + ".");
    }

    public static Nums inputs(Nums n)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        n.num1 = sc.nextInt();
        System.out.println("Enter the second number");
        n.num2 = sc.nextInt();
        if(n.num1 == n.num2)
        {
            throw new IllegalArgumentException("Invalid similar input: " + (n.num1));
        }
        if(n.num1 < n.num2)
        {
            n.large = n.num2;
        }
        else
        {
            n.large = n.num1;
        }
        System.out.println("Enter the third number");
        n.num3 = sc.nextInt();
        if(n.num3 == n.num1 || n.num3 == n.num2)
        {
            throw new IllegalArgumentException("Invalid similar input: " + (n.num3) );
        }
        if(n.num1 < n.num3 && n.num2 < n.num3)
        {
            n.large = n.num3;
        }
        return n;
    }
}
