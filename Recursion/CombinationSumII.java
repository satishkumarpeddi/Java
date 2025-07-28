package Recursion;
import java.util.*;

public class CombinationSumII {
    public static void backTracking(int index,int arr[],int target,List<Integer> combinations,List<List<Integer>> result){
        if(target==0){
            result.add(new ArrayList<>(combinations));
            return;
        }
        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            combinations.add(arr[i]);
            backTracking(i+1, arr, target-arr[i], combinations, result);
            combinations.remove(combinations.size()-1);
        }
    }   
    public static void getAllCombinationSumII(int arr[], int target){
        List<List<Integer>> result = new ArrayList<>();
        backTracking(0,arr,target,new ArrayList<>(),result);
        for(List<Integer> subset: result )
            System.out.println(subset);
        
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,1};
        int target = 5;
        getAllCombinationSumII(arr,target);
    }
}
