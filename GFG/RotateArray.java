package GFG;
import java.util.*;
public class RotateArray {
    public static void main(String[] args){
        int arr[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int d = 3;
        for(int i=0;i<=d;i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
