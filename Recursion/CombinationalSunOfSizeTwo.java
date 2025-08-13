package Recursion;
import java.util.*;
public class CombinationalSunOfSizeTwo {
    public static void backTracking(ArrayList<int []> result,int arr[],int targetValue,int combination[],int startIndex){
        if(combination.length==2){
            if(combination[0]+combination[1]==targetValue){
                int pair[] = Arrays.copyOf(combination, 2);
                Arrays.sort(pair);
                boolean found=false;
                for(int[] set:result){
                    if(Arrays.equals(set, pair)){
                        found=true;
                        break;
                    }
                }
                if(!found) result.add(pair);
            }
            return;
        } 
        for(int i=startIndex;i<arr.length;i++){
                int nextCombination[] = Arrays.copyOf(combination,combination.length+1);
                nextCombination[combination.length]=arr[i];
                backTracking(result, arr, targetValue, nextCombination,i+1);
            }
        
    }
    public static void getTheTargetSubSetValue(int arr[],int targetValue){
    ArrayList<int []> result = new ArrayList<>();
    backTracking(result,arr,targetValue,new int[0],0);
    System.out.print(result);
}
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        getTheTargetSubSetValue(arr,5);
    }
}