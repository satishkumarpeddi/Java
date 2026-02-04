package GFG;
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        String str = "zvvo";
        char[] arr = str.toCharArray();
        String result = "";
        HashSet<Character> set = new HashSet<>();
        for(char ch : arr) {
            if(!set.contains(ch)) {
                set.add(ch);
                result+=ch;
            }

        }
        System.out.println(result);
        System.out.println(Arrays.toString(arr));
    }
}
