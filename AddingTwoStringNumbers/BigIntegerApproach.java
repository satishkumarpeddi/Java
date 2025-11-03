package AddingTwoStringNumbers;
import java.math.*;
public class BigIntegerApproach{
    public static void main(String[] args){
        String num1 = "1234";
        String num2 = "3423";
        System.out.println(new BigInteger(num1).add(new BigInteger(num2)).toString());
    }
}