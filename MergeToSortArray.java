import java.util.*;
public class MergeToSortArray {
    private static HashSet<Integer> set = new HashSet<>();
    public static void MergeTwoSortedArray(int arr1[],int arr2[]){
        int i,j,k;
        i=j=k=0;
        int arr[] = new int[arr1.length+arr2.length];
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr[k]=arr1[i];
                i++;
            }else{
                arr[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<arr1.length){
            arr[k++]=arr1[i++];
        }
        while(j<arr2.length){
            arr[k++]=arr2[j++];
        }
        for(int num:arr){
            if(!set.contains(num))
                set.add(num);
        }
    }
    public static void main(String[] args){
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {2,3,6};
        MergeTwoSortedArray(arr1,arr2);
        System.out.println(set);
    }
}
