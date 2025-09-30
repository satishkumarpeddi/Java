import java.util.*;
public class ReorderPower2{
    public static boolean reorderPowerOf2(int num){
        String number = sort(num);
        for(int i=0;i<31;i++){
            int currentPower = 1<<i;
            String stringCurrentPower = sort(currentPower);
            if(number.equals(stringCurrentPower))
                return true;
        }
        return false;
    }
    public static String sort(int num){
        char[] arr = String.valueOf(num).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int num = sc.nextInt();
        System.out.println("Answer : "+reorderPowerOf2(num));
    }
}