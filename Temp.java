import java.util.*;
public class Temp {
    public static void backTracking(ArrayList<ArrayList<Integer>> result,int arr[],int target,ArrayList<Integer> combination,int start){
        if(target==0){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int i=start;i<arr.length;i++){
            if(i>start&&arr[i]==arr[i-1]) continue;
            combination.add(arr[i]);
            backTracking(result, arr, target-arr[i], combination, i+1);
            combination.remove(combination.size()-1);
        }
    }
    public static void getAllSubSets(int arr[],int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        backTracking(result,arr,target, new ArrayList<>(),0);
        System.out.println(result.size());
    }
    public static void main(String[] args){
        int arr[] = {3,2,1,5,4};
        getAllSubSets(arr,5);
    }
}
