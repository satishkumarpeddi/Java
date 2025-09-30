import java.util.Scanner;
import java.util.function.BiFunction;
public class ArrayOfFunctions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BiFunction<Integer,Integer,Integer>[] operations = new BiFunction[4];
        operations[0] = (a,b) -> a+b;
        operations[1] = (a,b) -> a-b;
        operations[2] = (a,b) -> a*b;
        operations[3] = (a,b) -> {
            if(b!=0) return a/b;
            else{
                System.out.println("Division by zero error!");
                return 0;
            }
        };
        System.out.println("Enter two numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("\nChoose operation:");
        System.out.println("0:Add\n1:Subtract\n2:Multiply\n3:Divide\n");
        int choice = sc.nextInt();
        if(choice>=0&&choice<operations.length){
            int result = operations[choice].apply(x, y);
            System.out.println("Result =  "+result);
        }else{
            System.out.println("Invalide choice!");
        }
    }
}
