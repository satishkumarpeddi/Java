package QuickSortUsingCallableOnArrayLists;

import java.util.*;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args)throws Exception{
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,9,8,7,3,2,1,0,-1));
        ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        Future<Void> sortedFuture = executorService.submit(new QuickSortTask(list, 0, list.size()-1, executorService));
        sortedFuture.get();
        executorService.shutdown();
        System.out.println("The sorted ArrayList using Thread Pool =>: "+list);
    }
}
