package Recursion;
import java.util.*;
public class FibonacciNumber {
    static Map<Integer,Integer> map = new HashMap<>();
    public static int fib(int n){
        if(n<=1){
                    return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result =  fib(n-1)+fib(n-2);
        map.put(n,result);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the fibonacci: ");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number: "+fib(n));
    }
}
