import java.util.*;

public class goodSubset {
    public static int countGoodSubset(List<Integer> arr){
        Collections.sort(arr);
        int dp[] = new int[arr.size()];
        Arrays.fill(dp,1);
        int total = 0;
        for(int i=0;i<arr.size();i++){
            for(int j=0;j<i;j++){
                if(arr.get(i)%arr.get(j)==0) 
                dp[i]+=dp[j];
            }
            total+=dp[i];
        }
        return total;
    }
    public static void main(String[] args){
        int arr[] = {2,4,5,15};
        // Convert primitive int[] to ArrayList<Integer> properly
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        int value = countGoodSubset(arrList);
        System.out.println(value);
    }
}
