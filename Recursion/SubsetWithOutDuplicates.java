package Recursion;

import java.util.*;

public class SubsetWithOutDuplicates {
    public static void generateAllSubset(int index,int arr[],List<Integer> current, List<List<Integer>> result){
        result.add(new ArrayList<>(current));
        for(int i=index;i<arr.length;i++){
            if(i>index&&arr[i]==arr[i-1]){
                continue;
            }
            current.add(arr[i]);
            generateAllSubset(i+1, arr, current, result);
            current.remove(current.size()-1);
        }
    }
    public static void getAllSubSets(int arr[]){
        Arrays.sort(arr);
        List<List<Integer>>  result = new ArrayList<>();
        generateAllSubset(0,arr,new ArrayList<>(),result);
        for(List<Integer> subset:result){
            for(int num: subset){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,2};
        getAllSubSets(arr);
    }
}
