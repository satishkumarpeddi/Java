package Leetcode;
public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args){
        char[] chArray = new char[]{'x','x','y','y'};
        char target = 'a';
        char result =' ';
        for(int i=0;i<chArray.length;i++){
            if(chArray[i]>target){
                result=chArray[i]; 
                break;
            }
        }
        if(result==' '){
            System.out.println(chArray[0]);
        }
        System.out.println(result);
    }
}
