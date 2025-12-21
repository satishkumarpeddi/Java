package QuickSortUsingCallableOnArrays;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args)throws Exception{
        int arr[] = {10, 7, 8, 9, 1, 5};
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        ExecutorService   eS = Executors.newSingleThreadExecutor();
        Future<Void> sortedList = eS.submit(new QuickSortTask(arr, 0, arr.length-1, executorService));
        sortedList.get();
        eS.shutdown();
        System.out.println("Quick Sort Done Using Thread Pooling Concept ==> : "+Arrays.toString(arr));

    }
}
