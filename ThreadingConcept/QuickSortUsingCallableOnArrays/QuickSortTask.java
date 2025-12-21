package QuickSortUsingCallableOnArrays;

import java.util.concurrent.Callable;
import java.util.concurrent.*;

public class QuickSortTask implements Callable<Void> {
    private final int arr[];
    private final int low;
    private final int high;
    private final ExecutorService executorService;
    QuickSortTask(int arr[],int low,int high,ExecutorService executorService){
        this.arr=arr;
        this.low=low;
        this.high=high;
        this.executorService=executorService;
    }
    @Override
    public Void call() throws Exception{
        if(low<high){
             int pivot = pivotMethod(arr,low,high);
        Future<Void> left = executorService.submit(new QuickSortTask(arr,low,pivot-1,executorService));
        Future<Void> right = executorService.submit(new QuickSortTask(arr, pivot+1, high, executorService));
        left.get();
        right.get();
        }
       
        return null;

    }
    private static int pivotMethod(int[] arr,int low,int high){
        int i = low-1;
        int pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
}
