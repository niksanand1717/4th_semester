/*
Write a program to design a calculator which perform +,-,/,% using
switch statement.
*/

import java.util.*;

class Calculate
{
    Scanner input = new Scanner(System.in);

    double num1, num2, result;

    void add()
    {
        System.out.print("Enter First number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Second number: ");
        num2 = input.nextDouble();
        result = num1 + num2;
        System.out.println("Result : "+result);
    }

    void substract()
    {
        System.out.print("Enter First number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Second number: ");
        num2 = input.nextDouble();
        result = num1 - num2;
        System.out.println("Result : "+result);
    }

    void quotient()
    {
        System.out.print("Enter Dividend number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Divisor number: ");
        num2 = input.nextDouble();
        result = num1 / num2;
        System.out.println("Result : "+result);
    }

    void remainder()
    {
        System.out.print("Enter Dividend number: ");
        num1 = input.nextDouble();
        System.out.print("Enter Divisor number: ");
        num2 = input.nextDouble();
        result = num1 % num2;
        System.out.println("Result : "+result);
    }
}

public class Calculator
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Calculate C1 = new Calculate();
        System.out.println("Press + to add two numbers");
        System.out.println("Press - to substract two numbers");
        System.out.println("Press / to obtain quotient operated by two numbers");
        System.out.println("Press % to find remainder operated by two numbers");
        System.out.print("Enter your choice: ");
        char choice = input.next().charAt(0);
        switch(choice)
        {
            case '+':
            {
                C1.add();
                break;
            }
            case '-':
            {
                C1.substract();
                break;
            }
            case '/':
            {
                C1.quotient();
                break;
            }
            case '%':
            {
                C1.remainder();
                break;
            }
            default:
            {
                System.out.println("Invalid choice\nexiting.....");
                System.exit(0);
            }

        }
    }
}
