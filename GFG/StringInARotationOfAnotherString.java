package GFG;
import java.util.*;
public class StringInARotationOfAnotherString {
    public static void main(String[] args){
        String st1 = "abac";
        String st2 = "baca";
        char[] st1Arr = st1.toCharArray();
        char[] st2Arr = st2.toCharArray();
        boolean flag= false;
        for(int i=0;i<st1.length();i++){
            char temp = st1Arr[st1Arr.length-1];
            for(int j=st1.length()-1;j>=1;j--)
                st1Arr[j]=st1Arr[j-1];
            st1Arr[0]=temp;
            System.out.println(Arrays.toString(st1Arr));
            if(Arrays.equals(st1Arr,st2Arr)){
                flag=true;
                break;
            }
        }
        System.out.println(flag?"Yes":"No");
    }
}
