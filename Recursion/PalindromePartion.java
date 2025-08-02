package Recursion;
import java.util.*;
public class PalindromePartion {
    public static void backTracking(List<List<String>> result,String word,List<String> combination,int index){
        if(index==word.length()){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int end=index;end<word.length();end++){
            if(isPalidrome(word,index,end)){
                combination.add(word.substring(index, end+1));
                backTracking(result, word, combination, index+1);
                combination.remove(combination.size()-1);
            }
        }
    }
    public static boolean isPalidrome(String word,int start,int end){
        while(start<end){
            if(word.charAt(start++)!=word.charAt(end--))
                return false;
        }
        return true;
    }
    public static void partionOfWords(String words){
        List<List<String>> result = new ArrayList<>();
        backTracking(result,words,new ArrayList<>(),0);
        System.out.println(result);
    }
    public static void main(String[] args){
        String words ="aab";
        partionOfWords(words);

    }
}
