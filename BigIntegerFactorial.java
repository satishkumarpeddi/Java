import java.util.*;
import java.math.BigInteger;
public class BigIntegerFactorial {
    public static String bigFact(int n){
        BigInteger result = BigInteger.ONE;
        for(int i=2;i<=n;i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        return String.valueOf(result);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The value of the factorial : "+bigFact(n));
    }
}
