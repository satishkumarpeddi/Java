package MergeSortUsingCallableOnArrayLists;
import java.util.*;
import java.util.concurrent.*;
public class MergeSortTask implements Callable<ArrayList<Integer>>{
    private final ArrayList<Integer> list;
    MergeSortTask(ArrayList<Integer> list){
        this.list=list;
    }
    @Override
    public ArrayList<Integer> call() throws Exception{
        if(list.size()<=1) return list;
        int mid = list.size()/2;
        ArrayList<Integer> left = new ArrayList<>(list.subList(0, mid));
        ArrayList<Integer> right = new ArrayList<>(list.subList(mid,list.size()));
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<ArrayList<Integer>> leftFuture = executorService.submit(new MergeSortTask(left));
        Future<ArrayList<Integer>> rightFuture = executorService.submit(new MergeSortTask(right));

        ArrayList<Integer> leftSortedList = leftFuture.get();
        ArrayList<Integer> rightSortedList = rightFuture.get();

        return merge(leftSortedList,rightSortedList);
    }
    private static ArrayList<Integer> merge(ArrayList<Integer> left,ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<>();
        int i=0,j=0;
        while(i<left.size()&&j<right.size()){
            if(left.get(i)<=right.get(j)){
                result.add(left.get(i++));
            }else{
                result.add(right.get(j++));
            }
        }
        while(i<left.size()){
            result.add(left.get(i++));
        }
        while(j<right.size()){
            result.add(right.get(j++));
        }  
        return result;
    }
}  
