package MergeSortUsingCallableOnArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args)throws Exception{
        // int arr[] = {1,4,5,3,1,2,0,0,1,-1};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,4,5,3,1,2,0,0,1,-1));
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<ArrayList<Integer>> sortedList = executorService.submit(new MergeSortTask(list));
        ArrayList<Integer> sortedOrderList = sortedList.get();
        System.out.println(sortedOrderList);
        executorService.shutdown();
    }
}
