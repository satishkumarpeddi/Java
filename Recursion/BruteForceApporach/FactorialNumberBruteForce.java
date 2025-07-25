package Recursion.BruteForceApporach;

import java.util.Scanner;
//Time Complexity O(n^2) and Space Complexity O(n) => because of call stack 
public class FactorialNumberBruteForce {
    public static int fact(int n){
        if(n<=1) return 1;
        return n*fact(n-1);
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the fibonacci: ");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number: "+fact(n));
   
    }
}
