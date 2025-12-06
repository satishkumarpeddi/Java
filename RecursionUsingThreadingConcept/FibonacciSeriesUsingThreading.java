package RecursionUsingThreadingConcept;
class FibonacciThreading extends Thread{
    private int n;
    private int result;
    public FibonacciThreading(int n){
        this.n=n;
    }
    public int getResultValue(){
        return result;
    }
    @Override
    public void run(){
        if(n<=1){
            result=n;
            return;
        }
        FibonacciThreading thread1 = new FibonacciThreading(n-1);
        FibonacciThreading thread2 = new FibonacciThreading(n-2);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        result = thread1.getResultValue()+thread2.getResultValue();
    }
}
public class FibonacciSeriesUsingThreading {
public static void main(String[] args){
    FibonacciThreading startingThread = new FibonacciThreading(10);
    startingThread.start();
    try{
        startingThread.join();
    }catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("The result : "+startingThread.getResultValue());
}
}
