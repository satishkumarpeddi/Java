import java.util.Scanner;
public class reversingNumberWithoutLoop {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a number to be reversed: ");
      int n = sc.nextInt();  
      int rem=0;
      for(;n!=0;rem=rem*10+n%10,n/=10);
      System.out.println("The reversed number : "+rem);
    }
}
