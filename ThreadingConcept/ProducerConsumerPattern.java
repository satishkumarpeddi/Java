
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class ProducerConsumerPattern {
    public static void main(String[] args){
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);
        Thread producer  = new Thread(()->{
            int value=1;
            try{
                while(true){
                    System.out.println("Producer produced : "+value);
                    queue.put(value);
                    value++;
                    Thread.sleep(500);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        Thread consumer = new Thread(()->{
            try{
                while(true){
                    int data= queue.take();
                    System.out.println("Consumer consumed: "+data);
                    Thread.sleep(1000);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        });
        producer.start();
        consumer.start();
    }
}
