package Recursion;
import java.util.*;
//Time Complexity O(n) and Space Complexity O(n) => because of hash map
public class FactorialNumber {
    static Map<Integer,Integer> map = new HashMap<>();
    public static int fact(int n){
        if(n<=1){
                    return n;
        }
        if(map.containsKey(n)){
            return map.get(n);
        }
        int result =  n*fact(n-1);
        map.put(n,result);
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to find the fibonacci: ");
        int n = sc.nextInt();
        System.out.println("The factorial of the given number: "+fact(n));
    }
}
