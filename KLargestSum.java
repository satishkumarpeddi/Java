import java.util.Arrays;

public class KLargestSum {
    public static void getKthLargestNumber(int arr[],int k){
        Arrays.sort(arr);
        int j=0;
        int newArr[] = new int[k];
        for(int i=arr.length-k;i<arr.length;i++){
            newArr[j++]=arr[i];
        }
        for(int num:newArr){
            System.out.print(num+" ");
        }
    }
    public static void main(String[] args){
        int arr[] = {3,4,2,1};
        int k =2;
        getKthLargestNumber(arr,k);
    }
}
