import java.util.Scanner;
public class FibonacciSeriesIntoArrayFormat {
    public static void getAllNumberOfFib(int num){
        int[] result = new int[num];
        if(num>=1) result[0]=0;
        if(num>=2) result[1]=1;
        for(int i=2;i<num;i++){
            result[i]=result[i-1]+result[i-2];
        }
        System.out.print("[");
        for(int value :result)
            System.out.print(value+" ");
        System.out.print("]");
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter to get all the fibonacci series numbers: ");
        int num =sc.nextInt();
         getAllNumberOfFib(num);

    }
}
