import java.util.*;
public class ReverseWordsInSentence {
    public static void main(String[] args){
        String str1 = "a b c d e f g h i j k l m n o p q r s t u v w x y z";
        String str = " "+str1+" ";
        List<Integer> num =new ArrayList<>();
        List<String> result = new ArrayList<>();
        num.add(0);
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isWhitespace(ch)){
               num.add(i);
            }    
        }
        for(int i=0;i<num.size()-1;i++){
            result.add(str.substring(num.get(i), num.get(i+1)));
        }        
        result = result.reversed();
        String words="";
        for(String word:result){
            words+=word;
        }
        System.out.println(words.trim());
    }
}
