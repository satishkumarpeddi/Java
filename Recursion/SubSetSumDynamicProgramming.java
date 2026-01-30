package Recursion;
import java.util.*;
public class SubSetSumDynamicProgramming {
    public static boolean getAllSubSetPossibleOrNot(int nums[],int target){
        boolean dp[] = new boolean[target+1];
        dp[0]=true;
        for(int num:nums){
            for(int j=target;j>=num;j--){
                if(dp[j-num])
                    dp[j]=true;
            }
        }
        return dp[target];
    }
    public static void main(String[] args){
        int nums[] = {1,3,2};
        int target=3;
     boolean exitOrNot =  getAllSubSetPossibleOrNot(nums,target);
     System.out.println(exitOrNot);
    }
}
