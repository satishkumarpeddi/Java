package GFG;
import java.util.*;
public class SumOfSubArrayRanges {
    public static void backTrackingMethod(int arr[],int n,ArrayList<ArrayList<Integer>> result,int index,ArrayList<Integer> list){
        result.add(new ArrayList<>(list));
        for(int i=index;i<n;i++){
            list.add(arr[i]);
            backTrackingMethod(arr, n, result, i+1, list);
            list.remove(list.size()-1);
        }
    }
    public static void sumOfSubArrayRanges(int arr[],int n){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backTrackingMethod(arr,n,result,0,new ArrayList<>());
        System.out.println(result);
    }
    public static void main(String[] args){
        int arr[] = {-32,0,-2,72};
        sumOfSubArrayRanges(arr,arr.length);
    }   
}
