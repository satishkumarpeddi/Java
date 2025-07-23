import java.util.*;
public class HappyNumber {
    static int calcSquare(int n){
        int rem=0;
        int sum=0;
        while(n!=0){
            rem=n%10;
            sum+=rem*rem;
            n/=10;
        }
        return sum;
    }
    static Boolean happyOrNot(int n){
        int slow=n;
        int fast=n;
        do{
            slow = calcSquare(slow);
            fast=calcSquare(calcSquare(fast));
        }while(slow!=fast);
        if(slow==1) return true;
        else 
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check weather the entered number is happy/not: ");
        int numValue = sc.nextInt();
        calcSquare(numValue);
        if(happyOrNot(numValue)){
            System.out.println("Happy Number");
        }else{
            System.out.println("Not a Happy Number");
        }
    }
}
