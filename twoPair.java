import java.util.*;

public class twoPair {
    public static int[] twoSum(int arr[],int n, int target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int diff = target-arr[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements into the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int[] result = twoSum(arr,n,target);
        if(result.length==2)
        System.out.println("["+result[0]+","+result[1]+"]");
        else
        System.out.println("Invalid output");
    }
}
