import java.util.*;
public class CyclicSort {
    public static void main(String[] args){
        int arr[] = {-6, 2, 3, 1, 0};
        for(int i=0;i<arr.length;i++){
            int correctIndexValue = arr[i]-1;
            if(arr[i]>0&&arr[i]<=arr.length&&arr[arr[i]-1]!=arr[i]){
                int temp=arr[i];
                arr[i]=arr[correctIndexValue];
                arr[correctIndexValue]=temp;
            }
        }
        // Arrays.sort(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
