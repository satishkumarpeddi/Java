import java.math.BigInteger;
import java.util.*;
public class OneDayTemp {
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3};
        StringBuilder str = new StringBuilder();
        for(int i=0;i<arr.length;i++){
            str.append(arr[i]);
        }
    
        String result = str.toString();
        BigInteger bi = new BigInteger(result);
        BigInteger add = BigInteger.valueOf(1);
        BigInteger resultv = bi.add(add);
        String resultStr = String.valueOf(resultv); 
        int[] resultArr = new int[resultStr.length()];
        for(int i=0;i<resultStr.length();i++){
            resultArr[i] = Integer.valueOf(resultStr.charAt(i)) - '0';

        }
        System.out.println(Arrays.toString(resultArr));
        System.out.println(resultStr);
    }
}
