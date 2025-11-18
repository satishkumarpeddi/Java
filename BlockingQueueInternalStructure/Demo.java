package BlockingQueueInternalStructure;
import java.util.*;
class BlockingQueue<T>{
    private Queue<T> queue= new LinkedList<>();
    private int capacity;
    public  BlockingQueue(int capacity){
        this.capacity=capacity;
    }
    public void put(T item)throws InterruptedException{
        synchronized(this){
            while(queue.size()==capacity)
                wait();
            queue.add(item);
            notifyAll();
        }
    }
    public T take()throws InterruptedException{
        synchronized(this){
            while(queue.isEmpty())
                wait();
            T item = queue.poll();
            notifyAll();
            return item;
        }
    }
    public int size(){
        synchronized(this){
            return queue.size();
        }
    }
}
public class Demo {
    public static void main(String[] args){
        BlockingQueue<Integer> queue = new BlockingQueue<>(3);
        Thread producer = new Thread(()->{
            for(int i=1;i<=5;i++){
                try{
                    System.out.println("Producer "+i);
                    queue.put(i);
                    Thread.sleep(1000);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        Thread consumer = new Thread(()->{
            for(int i=1;i<=5;i++){
                try{
                    int value = queue.take();
                    System.out.println("Consumer : "+value);
                    Thread.sleep(600);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
