package RecursionUsingThreadingConcept;
class RecursionThreadDemo extends Thread{
    int count=0;
    public RecursionThreadDemo(int count){
        this.count = count;
    }
    @Override
    public void run(){
        System.out.println("Thread --> "+count+" is running");
        if(count<=0) return;
        RecursionThreadDemo next  = new RecursionThreadDemo(count-1);
        next.start();
        try{
            next.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Thread --> "+count+" finished");
    }
}
public class RecursiongThreadingUsingThreadClass{
    public static void main(String[] args){
        RecursionThreadDemo next = new RecursionThreadDemo(5);
    next.start();
    }
}