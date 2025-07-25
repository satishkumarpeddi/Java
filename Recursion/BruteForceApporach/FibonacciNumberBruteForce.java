package Recursion.BruteForceApporach;

import java.util.Scanner;
public class FibonacciNumberBruteForce {
    public static  int fib(int n){
        if(n<=1)
                return n;
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the fibonacci: ");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number: "+fib(n));
    }
}
