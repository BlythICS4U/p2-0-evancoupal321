/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2.pkg0;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class P20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("QUESTION 1");
        int y; //Declare variables
        boolean prime;
        String primeString;
        
        System.out.printf("%-5s%-7s%-12s", "x", "y", "Is y prime?"); //Start of chart
        System.out.println();
        
        for (int x = 35; x <= 50; x++) //Logic & Print Result
        {
            y = getBabbage(x);
            prime = isPrime(y);
            if (prime)
            {
                primeString = "yes";
            }
            else
            {
                primeString = "no";
            }
            System.out.printf("%-5d%-7d%-12s", x, y, primeString);
            System.out.println();
        }
        
        System.out.println();
        System.out.println("QUESTION 2");
        int number, factorial = 1; //Declare & Set Variables
        System.out.println("Enter a number.");
        number = scan.nextInt();
        while (number <= 0)
        {
            System.out.println("This number is zero or negative. Try again.");
            number = scan.nextInt();
        }
        
        System.out.print("Factorial = "); //Print equation
        for (int i = 1; i <= number; i++) 
        {
            System.out.print(i + " ");
            if (i != number)
            {
                System.out.print("X ");
            }
        }
        
        factorial = getFactorial(number); //Print arithmetic result
        System.out.print("= " + factorial);
        
        System.out.println();
        System.out.println();
        System.out.println("QUESTION 3");
        int i1, i2, i3, maxInt2, maxInt3; //Declare variables
        double d1, d2, d3, maxDouble2, maxDouble3;
        
        System.out.println("Enter the first integer."); //Set variables
        i1 = scan.nextInt();
        System.out.println("Enter the second integer.");
        i2 = scan.nextInt();
        System.out.println("Enter the third integer.");
        i3 = scan.nextInt();
        System.out.println("Enter the first double.");
        d1 = scan.nextDouble();
        System.out.println("Enter the second double.");
        d2 = scan.nextDouble();
        System.out.println("Enter the third double.");
        d3 = scan.nextDouble();
        maxInt2 = max(i1, i2);
        maxInt3 = max(i1, i2, i3);
        maxDouble2 = max(d1, d2);
        maxDouble3 = max(d1, d2, d3);
        
        System.out.println("The largest value of the first two integers is: " + maxInt2); //Print result
        System.out.println("The largest value of all three integers is: " + maxInt3);
        System.out.println("The largest value of the first two doubles is: " + maxDouble2);
        System.out.println("The largest value of all three doubles is: " + maxDouble3);
        
    }
    
    public static int getBabbage(int x) //Question 1
    {
        int y = x*x + x + 41;
        return y;
    }
    
    public static boolean isPrime(int y)
    {
        for (int i = 2; i <= Math.sqrt(y); i ++)
        {
            if (y%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static int getFactorial(int number) //Question 2
    {
        int fact = 1;
        for (int i = 1; i <= number; i++)
        {
            fact *= i;
        }
        return fact;
    }
    public static int max (int a, int b) //Question 3 (Note: even if two values are the same, it will return the correct amount.)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static int max (int a, int b, int c)
    {
        if (a > b)
        {
            if (a > c)
            {
                return a;
            }
            else
            {
                return c;
            }
        }
        else
        {
            if (b > c)
            {
                return b;
            }
            else
            {
                return c;
            }
        }
    }
    public static double max (double a, double b)
    {
        if (a > b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }
    public static double max (double a, double b, double c)
    {
        if (a > b)
        {
            if (a > c)
            {
                return a;
            }
            else
            {
                return c;
            }
        }
        else
        {
            if (b > c)
            {
                return b;
            }
            else
            {
                return c;
            }
        }
    }
    
}
