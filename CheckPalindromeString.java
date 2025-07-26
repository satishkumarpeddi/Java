import java.util.*;
public class CheckPalindromeString {
    public static boolean palindromeString(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(left<right&&!Character.isLetterOrDigit(str.charAt(left))){
                left++;
            }
            if(left<right&&!Character.isLetterOrDigit(str.charAt(right))){
                right--;
            }
            if (Character.toLowerCase(str.charAt(left)) != Character.toLowerCase(str.charAt(right))) {
                return false;
            }
        right--;
        left++;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string to check the palindrome/not: ");
        String str = sc.nextLine();
        System.out.print(palindromeString(str));
    }
}
