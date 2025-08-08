import java.util.*;
public class SieveofEratosthenes {
    public static ArrayList<Integer> allPrimeNumber(int numValue){
        ArrayList<Integer> result = new ArrayList<>();
        boolean isPrime[] = new boolean[numValue+1];
        for(int i=2;i<=numValue;i++)
            isPrime[i]=true;
        for(int p=2;p*p<=numValue;p++){
            if(isPrime[p]){
                for(int i=p*p;i<=numValue;i+=p){
                    isPrime[i]=false;
                }
            }
        }
        for(int i=2;i<=numValue;i++){
            if(isPrime[i])
                result.add(i);
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();
        System.out.print("Enter a number to print all number's : ");
        int numValue = sc.nextInt();
        result = allPrimeNumber(numValue);
        System.out.println(result);
    }   
}
