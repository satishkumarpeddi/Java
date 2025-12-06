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
        FibonacciThreading fibThread1 = new FibonacciThreading(n-1);
        FibonacciThreading fibThread2 = new FibonacciThreading(n-2);
        Thread thread1 = new Thread(fibThread1);
        Thread thread2 = new Thread(fibThread2);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        result = fibThread1.getResultValue()+fibThread2.getResultValue();
    }
}
public class FibonacciSeriesUsingRunnableInterface {
public static void main(String[] args){
    FibonacciThreading methodStartingThread = new FibonacciThreading(15);
    Thread startingThread = new Thread(methodStartingThread);
    startingThread.start();
    try{
        startingThread.join();
    }catch(Exception e){
        e.printStackTrace();
    }
    System.out.println("The result : "+methodStartingThread.getResultValue());
}
}

