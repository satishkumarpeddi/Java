import java.util.Scanner;
public class towerHanoi{
    public static void towerHanoi(int n,char source,char destination,char helper){
        if(n==1){
            System.out.println("Move form 1 "+source +" to "+destination);
            return;
        }
        towerHanoi(n-1, source, helper, destination);
        System.out.println("Move form " + n +" "  + source +" to "+destination);
        towerHanoi(n-1, helper, destination, source);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disc to perform 'towerHanoi':");
        int n = sc.nextInt();
        towerHanoi(n,'A','C','B');
    }
}