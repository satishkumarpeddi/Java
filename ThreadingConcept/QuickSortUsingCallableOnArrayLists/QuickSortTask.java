package QuickSortUsingCallableOnArrayLists;
import java.util.*;
import java.util.concurrent.*;
public class QuickSortTask implements Callable<Void> {
    private final ArrayList<Integer> list;
    private final int low;
    private final int high;
    private final ExecutorService executorService;
    public QuickSortTask(ArrayList<Integer> list,int low,int high,ExecutorService executorService){
        this.list=list;
        this.low=low;
        this.high=high;
        this.executorService=executorService;
    }
    @Override
    public Void call() throws Exception{
        if(low<high){
            int pi = paritionMethod(list,low,high);
            Future<Void> left = executorService.submit(new QuickSortTask(list, low, pi-1, executorService));
            Future<Void> right = executorService.submit(new QuickSortTask(list, pi+1, high, executorService));
            left.get();
            right.get();
        }
        return null;
    }
    private static int paritionMethod(ArrayList<Integer> list,int low,int high){
        int i = low-1;
        int pivot = list.get(high);
        for(int j=low;j<high;j++){
            if(list.get(j)<=pivot){
                i++;
                // int temp=list.get(i);
                // list.set(i,list.get(j));
                // list.set(j,temp);
                Collections.swap(list,i,j);
            }
        }
        // int temp = list.get(i+1);
        // list.set(i+1,list.get(high));
        // list.set(high,temp);
        Collections.swap(list,i+1,high);
        return i+1;
    }
}
