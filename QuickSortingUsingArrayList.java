import java.util.*;

public class QuickSortingUsingArrayList{
    static int partion(List<Integer> arr,int low, int high){
        int pivot = arr.get(high);
        int i =  low-1;
        for(int j=low;j<high;j++){
            if(arr.get(j)<=pivot){
                i++;
                int temp = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j,temp);
            }
        }
        int temp = arr.get(i+1);
        arr.set(i+1,arr.get(high));
        arr.set(high,temp);
        return i+1;
    }
    static void quickSortHelper(List<Integer> arr,int low, int high){
        if(low<high){
            int pi = partion(arr,low,high);
            quickSortHelper(arr, low, pi-1);
            quickSortHelper(arr, pi+1,high);
        }
    }
    static List<Integer> quickSortAlgo(List<Integer> arr){
        if(arr==null||arr.size()==0)
            return arr;
        quickSortHelper(arr,0,arr.size()-1);
        return arr;
    }
    public static void main(String[] args){
        List<Integer> arr = new ArrayList<>();
        arr.add(3);
        arr.add(2);
        arr.add(0);
        arr.add(6);
        arr.add(1);
        List<Integer>  result = quickSortAlgo(arr);
        for(int num: result){
            System.out.print(num+" ");
        }
    }
}