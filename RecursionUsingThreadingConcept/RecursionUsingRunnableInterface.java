package RecursionUsingThreadingConcept;
class RecursionUsingInterface implements Runnable{
    private int count=0;
    public RecursionUsingInterface(int count){
        this.count=count;
    }
    @Override
    public void run(){
        System.out.println("Thread --> "+count+" is running.");
        if(count<=0) return;
        Thread thread = new Thread(new RecursionThreadDemo(count-1));
        thread.start();
        try{
            thread.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread --> "+count+"  is finished.");
    }
}
public class RecursionUsingRunnableInterface {
    public static void main(String[] args){
        System.out.println("The Demo Visulization Of Recursion Threading Using Runnable Interface.");
        Thread threadOfInterface = new Thread(new RecursionThreadDemo(5));
        threadOfInterface.start();
        
    }
}
