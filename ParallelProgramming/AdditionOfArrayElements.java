package ParallelProgramming;
// import java.util.*;
class AddArray extends Thread{
    private int[] arr;
    private int start,end;
    private int partialSum;
    public AddArray(int[] arr,int start,int end){
        this.arr=arr;
        this.start=start;
        this.end=end;
        this.partialSum=0;
    } 
    public int getPartialSum(){
        return this.partialSum;
    }
    @Override
    public void run(){
        for(int i=start;i<end;i++){
            partialSum+=arr[i];
            System.out.println("Thread "+Thread.currentThread().getName()+" adding arr["+i+"]="+arr[i]);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
public class AdditionOfArrayElements{
    public static void main(String[] args)throws InterruptedException{
        int arr[] = {1,5,6,3,4,2,1,0};
        int numThreads=4;
        AddArray[] threads = new AddArray[numThreads];
        int chuckSize = (int)Math.ceil((double)arr.length/numThreads);
        for(int i=0;i<numThreads;i++){
            int start = i*chuckSize;
            int end = Math.min(start+chuckSize,arr.length);
            threads[i]=new AddArray(arr, start, end);
            threads[i].start();
        }
        int totalSum=0;
        for(int i=0;i<numThreads;i++){
            threads[i].join();
            totalSum+=threads[i].getPartialSum();
        }
        System.out.println("Sum of array elements = "+totalSum);
    }
}