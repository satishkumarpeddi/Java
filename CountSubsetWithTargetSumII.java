import java.util.*;

public class CountSubsetWithTargetSumII {
    private static Map<String,Integer> dp;
    public static int countSubsets(int arr[],int target){
        int psum=0,nsum=0;
        for(int num:arr){
            if(num>0) psum+=num;
            else
                nsum+=num;
        }
        dp = new HashMap<>();
        return solve(0,arr,target);
    }
    public static int solve(int i,int arr[],int target){
        if(i==arr.length) return target==0?1:0;
        String str = i+" "+target;
        if(dp.containsKey(str)) return dp.get(str);
        int include = solve(i+1,arr,target-arr[i]);
        int exclude = solve(i+1,arr,target);
        dp.put(str,include+exclude);
        return include+exclude;
    }
    public static void main(String[] args){
        int arr[] = {8,3,4,7,1,0,1,0};
        int k = 2;
        int result = countSubsets(arr,k);
        System.out.println("The number of subsets : "+result);
    }
}
