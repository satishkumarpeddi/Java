public class KadanesAlgo {
    public static void findMaximumSumInAnArr(int nums[]){
        long maxSum=0,currentSum=0;
        for(int num:nums){
            currentSum = Math.max(0,currentSum+num);
            maxSum = Math.max(currentSum,maxSum);
        }
        System.out.println("The maximum sum in the arr: "+maxSum);
    }
    public static void main(String[] args){
        int arr[] = {1, 2, 7, -4, 3, 2, -10, 9, 1};
        findMaximumSumInAnArr(arr);
    }
}
