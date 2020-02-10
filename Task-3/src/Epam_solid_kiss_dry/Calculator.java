package Epam_solid_kiss_dry;

import java.util.Scanner;
import java.io.*;
public class Calculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        System.out.print("Enter operation you want to perform ?");
        char operation = sc.next().charAt(0);
        double result;
        switch(operation)
        {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.printf("Operator you selected is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", a, operation, b, result);
    }
}