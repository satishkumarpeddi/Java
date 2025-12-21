import java.util.concurrent.*;
import java.util.*;
class LogicPart implements  Callable<int[]>{
    private final int arr[];
    LogicPart(int arr[]){
        this.arr=arr;
    }
    @Override
    public int[] call() throws Exception{
        if(arr.length<=1) return arr;
        int mid = arr.length/2;
        int[] left = Arrays.copyOfRange(arr,0,mid);
        int[] right = Arrays.copyOfRange(arr,mid,arr.length);
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<int[]> leftFuture = executorService.submit(new LogicPart(left));
        Future<int[]> rightFuture = executorService.submit(new LogicPart(right));
        int[] sortedLeft = leftFuture.get();
        int[] sortedRight = rightFuture.get();
        executorService.shutdown();
        return merge(sortedLeft,sortedRight);
    }
    private static int[]  merge(int[] sortedLeft,int[] sortedRight){
        int[] result = new int[sortedLeft.length+sortedRight.length];
        int i=0,j=0,k=0;
        while(i<sortedLeft.length&&j<sortedRight.length){
            if(sortedLeft[i]<=sortedRight[j]){
                result[k]=sortedLeft[i];
                i++;
            }else{
                result[k]=sortedRight[j];
                j++;
            }
            k++;
        }
        while(i<sortedLeft.length){
            result[k++]=sortedLeft[i++];
        }
        while(j<sortedRight.length){
            result[k++]=sortedRight[j++];
        }
        return result;
    }
}