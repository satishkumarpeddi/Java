package Recursion;
import java.util.*;

public class PrintAllSubSet {
    static void generateSubSet(int index,int arr[],List<Integer> current,List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=index;i<arr.length;i++){
            current.add(arr[i]);
            generateSubSet(i+1, arr, current, result);
            current.remove(current.size()-1);
        }
    }
    static void printAllSubSet(int arr[],int n){
        List<List<Integer>> result = new ArrayList<>();
        generateSubSet(0,arr,new ArrayList<>(),result);
        for(List<Integer> subsets : result){
            System.out.println(subsets);
        }
    }
    public static void main(String[] args){
        int arr[] = new int[]{2,5,6};
        printAllSubSet(arr,arr.length);
    }
}
