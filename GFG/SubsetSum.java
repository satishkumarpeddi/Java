package GFG;
import java.util.*;
public class SubsetSum {
    public static void backTrackingMethod(int arr[],ArrayList<ArrayList<Integer>> result,int index,ArrayList<Integer> list){
        result.add(new ArrayList<>(list));
        for(int i=index;i<arr.length;i++){
            list.add(arr[i]);
            backTrackingMethod(arr, result, i+1, list);
            list.remove(list.size()-1);
        }
    }
    public static void subsetUtilMethod(int arr[]){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        backTrackingMethod(arr,result,0,new ArrayList<>());
        for(ArrayList<Integer> a:result){
            int sum=0;
            for(Integer num: a){
                sum+=num;
            }
            list.add(sum);
        }
        System.out.println(result);
        System.out.println(list);
    }
    public static void main(String[] args){
        int arr[] = {2,3};
        subsetUtilMethod(arr);
    }
}
