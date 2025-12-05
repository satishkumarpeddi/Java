import java.util.*;

class Threadize extends Thread{
    private int count;
    private PriorityQueue<Integer> pq;
        public Threadize(PriorityQueue<Integer> pq){
            this.pq=pq;
        }
         @Override
        public void run(){
        try{
            while(pq.size()>1){
            int temp = pq.poll()+pq.poll();
            count+=temp;
                pq.add(temp);
            // Thread.sleep(1000);
         }
        }catch(Exception e){
            
        }
    }
    public int valueOfCount(){
        return count;
    }
       
        
}
public class OptimalMergePattern {
    public static void main(String[] args)throws InterruptedException{
             int files[] = new int[]{28,32,12,5,84,53,91,35,3,11};
         PriorityQueue<Integer> pq = new PriorityQueue<>();
         for(int i=0;i<files.length;i++){
             pq.add(files[i]);
            }
            Threadize thread = new Threadize(pq);
            thread.start();
            thread.join();
        System.out.println("Minimum Computation : "+thread.valueOfCount());
    }
}
