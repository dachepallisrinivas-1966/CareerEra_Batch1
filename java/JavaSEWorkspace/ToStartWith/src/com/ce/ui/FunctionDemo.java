package com.ce.ui;

import java.util.Scanner;

public class FunctionDemo {

    static int factorial(int num) {
        int fact = 1;
        for(int index = num; index >= 2; index--) {
            fact *= index;
        }
        return fact;
    }
    
    static int factorialR(int num) {
       if (num == 0)
    	   return 1;
       
       return num*factorial(num-1);
    }
    
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter n and r: ");
        int n = scan.nextInt();
        int r = scan.nextInt();
        int ncr = factorialR(n) / (factorialR(n-r) * factorialR(r));
        int npr = factorialR(n) / factorialR(n-r);
        System.out.println("ncr = " + ncr);
        System.out.println("npr = " + npr);
        scan.close();
    }
}
