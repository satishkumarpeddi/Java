package Recursion;
import java.util.*;
public class FibonacciSeries {
    private static int MOD =  1000000007;
    private static long[][] multiply(long[][] A,long[][] B){
        long[][] C = new long[2][2];
        C[0][0] = (A[0][0]*B[0][0]%MOD+A[0][1]*B[1][0]%MOD)%MOD;
        C[0][1] = (A[0][0]*B[0][1]%MOD+A[0][1]*B[1][1]%MOD)%MOD;
        C[1][0] = (A[1][0]*B[0][0]%MOD+A[1][1]*B[1][0]%MOD)%MOD;
        C[1][1] = (A[1][0]*B[0][1]%MOD+A[1][1]*B[1][1]%MOD)%MOD;
        return C;
    }
    private static long[][] matrixPower(long[][] base,long power){
        long[][] result = {{1,0},{0,1}};
        while(power>0){
            if((power&1)==1){
                result = multiply(result,base);
            }
            base = multiply(base,base);
            power >>=1;
        }
        return result;
    }
    private static long fib(long n){
        if(n==0) return 0;
        long[][] base = {{1,1},{1,0}};
        long[][] res = matrixPower(base,n-1);
        return res[0][0];
    }
    public static int fiboSum(int n,int m){
        long fibMplus2 = fib(m+2);
        long fibMplus1 = fib(n+1);
        long sum = (fibMplus2-fibMplus1+MOD)%MOD;
        return (int)sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value for variable n and m: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = fiboSum(n,m);
        System.out.println("Sum of fibonacci from "+n+" "+m+" : "+sum);
    }
}
