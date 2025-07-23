import java.util.Scanner;
public class ReversingString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String word = sc.nextLine();
        char words[] = word.toCharArray();
        int left =0;
        int right = word.length()-1;
        while(left<right){
            char temp = words[left];
            words[left]=words[right];
            words[right]=temp;
            left++;
            right--;
        }
        String str = new String(words);
        if(word.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
