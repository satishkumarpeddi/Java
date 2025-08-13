package Recursion;
import java.util.*;
public class PermutationUnqiue{
    public static void backTracking(List<List<Integer>> result,int nums[],List<Integer> combination,boolean used[]){
        if((nums.length)==(combination.size())){
            result.add(new ArrayList<>(combination));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]) continue;
            if(i>0&&nums[i]==nums[i-1]&&!used[i-1]) continue;
            used[i]=true;
            combination.add(nums[i]);
            backTracking(result, nums, combination, used);
            used[i]=false;
            combination.remove(combination.size()-1);
        }
    }
    public static void getAllSubSetsOfNums(int nums[]){
        List<List<Integer>> result = new ArrayList<>();
        boolean used[] = new boolean[nums.length];
        backTracking(result,nums,new ArrayList<>(),used);
        System.out.println(result);
    }
    public static void main(String[] args){
        int nums[] = {1,2,1};
        getAllSubSetsOfNums(nums);
    }
}