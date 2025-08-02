package Recursion;
import java.util.*;
public class LettersCombinationIsWordsList {
    private static String[] digitToLetters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    
    public static void backTracking(ArrayList<String> result,HashSet<String> wordsSet,String Squence,String currentString,int index){
        if(index==Squence.length()){
            if(wordsSet.contains(currentString)){
                result.add(currentString);
            }
            return;
        }
        String letters = digitToLetters[Squence.charAt(index)-'0'];
        for(char letter:letters.toCharArray()){
            backTracking(result, wordsSet, Squence, currentString+letter, index+1);
        }
    }
    public static void ToFindTheWheatherInWordsList(ArrayList<String> words,String Squence){
        ArrayList<String> result = new ArrayList<>();
        LinkedHashSet<String> wordsSet = new LinkedHashSet<>(words);
        backTracking(result,wordsSet,Squence,"",0);
        System.out.println(result);
    }
    public static void main(String[] args){
        ArrayList<String>  words = new ArrayList<>(Arrays.asList("used" ,"code", "ride", "tree", "boed"));
        String sequence ="2633";
        ToFindTheWheatherInWordsList(words,sequence);
    }
}
