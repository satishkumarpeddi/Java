package Recursion;
import java.util.*;
public class SubsetSum {
    public static void backTracking(int nums[],List<List<Integer>> result,List<Integer> combination,int target,int index){
        int sum=0;
        for(int num:combination){
            sum+=num;
        }
        if(sum==target&&result.isEmpty()){
            result.add(new ArrayList<>(combination));
        }else{
            sum=0;
        }
        for(int i=index;i<nums.length;i++){
            combination.add(nums[i]);
            backTracking(nums, result, combination, target, i+1);
            combination.remove(combination.size()-1);
        }
    }
    public static void getAllPossibleSumSetSum(int nums[],int target){
        List<List<Integer>> result = new ArrayList<>();
        backTracking(nums,result,new ArrayList<>(),target,0);
        for(List<Integer> subset:result){
            System.out.println(subset);
        }
    }
    public static void main(String[] args){
        int nums[] = {2,1,3,4,5};
        int target=5;
        getAllPossibleSumSetSum(nums,target);
    }
}
