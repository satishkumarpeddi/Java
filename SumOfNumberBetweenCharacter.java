import java.util.Scanner;
public class SumOfNumberBetweenCharacter {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a string: ");
       String word = sc.nextLine();
        char letters[] = word.toCharArray();
        int sum=0;
        for(int i=0;i<word.length()-1;i++){
            if(Character.isDigit(word.charAt(i))){
                int num = word.charAt(i)-'0';
                sum +=num;
            }
            if(Character.isLetter(word.charAt(i))&&Character.isLetter(word.charAt(i+1))){
                char temp =  word.charAt(i);
                char tempVar = word.charAt(i+1);
                letters[i+1] = temp;
                letters[i]=tempVar;
            }
        }
        System.out.println(sum);
        System.out.println(letters);
    }
}
