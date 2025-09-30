public class SlidingWindowPrefixSum {
    public static int[] getSubSetOfTargetValue(int numSet[],int target){
        int left=0,sum=0;
        for(int right=0;right<numSet.length;right++){
            sum+= numSet[right];
            while(sum>target&&left<right){
                sum-=numSet[left++];
            }
            if(sum==target)
             return new int[]{left,right};
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int numSet[] = {1,2,3,7,5};
        int result[]=getSubSetOfTargetValue(numSet,12);
        for(int num:result){
            System.out.print(num+" ");
        }
    }
}
