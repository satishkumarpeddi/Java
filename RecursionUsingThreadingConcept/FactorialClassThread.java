package RecursionUsingThreadingConcept;
import java.util.*;
class FactorialThreading extends Thread{
    private int n;
    private long result;
    public FactorialThreading(int n){
        this.n=n;
    }
    public long getValue(){
        return result;
    }
    @Override
    public void run(){
        if(n<=1){
            result=1;
            return;
        }
        FactorialThreading factChild = new FactorialThreading(n-1);
        factChild.start();
        try{
            factChild.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        result = n*factChild.getValue();
    }
}
public class FactorialClassThread {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find the factorial of given number : ");
        int n = sc.nextInt();
        FactorialThreading fact = new FactorialThreading(n);
        fact.start();
        try{
            fact.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("The factorial : "+fact.getValue());
    }
}
