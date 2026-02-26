package GFG;

import java.util.Arrays;

public class IsomorphicStrings {
    public static void main(String[] args){
        String s1 = "aab";
        String s2 = "xxy";
        if(s1.length()!=s2.length()){
            System.out.println("False");
            System.exit(0);
        }
        int[] str1 = new int[256];
        int[] str2 = new int[256];
        Arrays.fill(str1,-1);
        Arrays.fill(str2,-1);
        for(int i=0;i<s1.length();i++){
            char ss = s1.charAt(i);
            char tt = s2.charAt(i);
            if(str1[ss]==-1&&str2[tt]==-1){
                str1[ss]=tt;
                str2[tt]=ss;
            }else if(str1[ss]!=tt||str2[tt]!=ss){
                System.out.println("False");
                System.exit(0);
            }
        }
        System.out.println("True");
    }
}
