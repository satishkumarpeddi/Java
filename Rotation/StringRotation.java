package Rotation;
import java.util.*;
public class StringRotation {
    public static void leftRotation(String s,int n){
        char[] strArray = s.toCharArray();
        for(int i=0;i<n;i++){
            char first = strArray[0];
            for(int j=0;j<s.length()-1;j++){
                strArray[j]=strArray[j+1];
            }
            strArray[strArray.length-1]=first;
        }
        System.out.println(strArray);
    }
    public static void rightRotation(String s,int n){
        char[] strArray = s.toCharArray();
        for(int i=0;i<n;i++){
            char last = strArray[strArray.length-1];
            for(int j=strArray.length-1;j>0;j--){
                strArray[j]=strArray[j-1];
            }
            strArray[0]=last;
        }
        System.out.println(strArray);
    }
    public static void main(String[] args){
        String newStr = "coding";
        rightRotation(newStr,2);
        leftRotation(newStr,2);
    }
}
