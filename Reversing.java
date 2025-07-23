import java.util.*;
public class Reversing {
    public static void main(String[] args){
        int arr[] = new int[]{15,22,3,89,42,67,99};
        int left=0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
