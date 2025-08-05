package Recursion;
import java.util.*;
public class LetterCombinationsPhonePattern {
    private static String[] digitToLetters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void backTracking(ArrayList<String> result,String currentString,int index,String digits){
        if(index==digits.length()){
            result.add(currentString);
            return;
        }
        String letters = digitToLetters[digits.charAt(index)-'0'];
        for(char letter: letters.toCharArray()){
            backTracking(result, currentString+letter, index+1, digits);
        }
    }
    public static void getAllCombinations(String digits){
        ArrayList<String> result = new ArrayList<>();
        backTracking(result,"",0,digits);
        System.out.println(result);
    }
    public static void main(String[] args){
        String digits = "92";
        getAllCombinations(digits);
    }
}
