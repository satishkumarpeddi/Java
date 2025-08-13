import java.util.*;
public class CombinationTwoArray {
    public static void getAllSubSets(int nums[],int targetValue){
        ArrayList<int[]> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==targetValue){
                    int firstValue = Math.min(nums[i], nums[j]);
                    int secondValue = Math.max(nums[i],nums[j]);
                    result.add(new int[]{firstValue,secondValue});
                }
            }
        }
        result.sort((a,b)->{
            if(a[0]!=b[0]) return Integer.compare(a[0], b[0]);
            return Integer.compare(a[1], b[1]);
        });
        for(int[] pair:result){
            System.out.println(Arrays.toString(pair));

        }
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,4,5};
        getAllSubSets(nums,5);
    }
}
