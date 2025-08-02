package Recursion;
import java.util.*;
public class ContinousSumTarget {
    public static void backTracking(int arr[],ArrayList<ArrayList<Integer>> result,HashSet<String> set,int n,int target,ArrayList<Integer> combination,int start){
        if(combination.size()==3){
            int sum=0;
            for(int num:combination){
                sum+=num;
            }
            if(sum==target){
                ArrayList<Integer> temp = new ArrayList<>(combination);
                Collections.sort(temp);
                String key = temp.get(0) + "," + temp.get(1) + "," + temp.get(2);
                if(!set.contains(key)){
                    set.add(key);
                    result.add(temp);
                }
                return;
            }
            
        }
        for(int i=start;i<n;i++){
            combination.add(arr[i]);
            backTracking(arr, result, set, n, target, combination, i+1);
            combination.remove(combination.size()-1);
        }
    }
    public static void find3Sum(int arr[],int n,int target){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        backTracking(arr,result,set,n,target,new ArrayList<>(),0);
        for(ArrayList<Integer> subset:result){
            System.out.println(subset);
        }
    }
    public static void main(String[] args){
        int arr[] = {10,5,5,5,2};
        int target=12;
        find3Sum(arr,arr.length,target);
    }
}
