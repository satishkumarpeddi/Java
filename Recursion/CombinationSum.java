package Recursion;
import java.util.*;
public class CombinationSum {
    public static void backTracking(int index,int target,int arr[],List<Integer> combinations,List<List<Integer>> result){
        if(target==0)
            result.add(new ArrayList<>(combinations));
        if(target<0)    return;
        for(int i=index;i<arr.length;i++){
            combinations.add(arr[i]);
            backTracking(i, target-arr[i], arr, combinations, result);
            combinations.remove(combinations.size()-1);
        }
    }
    public static void CombinationOfSum(int arr[],int target){
        List<List<Integer>> result = new ArrayList<>();
        backTracking(0,target,arr,new ArrayList<>(),result);
        for(List<Integer>  subset:result){
            System.out.println(subset);
        }
    }
    public static void main(String[] args){
        int arr[] = {2,5,6};
        int target=8;
        CombinationOfSum(arr,target);
    }
}
