package Recursion;
import java.util.*;
public class Permutations {
    public static void generateSubset(int arr[],boolean used[],List<Integer> current,List<List<Integer>> result){
        if(current.size()==arr.length){
            result.add(new ArrayList<>(current));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!used[i]){
                used[i]=true;
            current.add(arr[i]);
            generateSubset(arr, used, current, result);
            used[i]=false;
            current.remove(current.size()-1);
            }
        }
    }
    public static void getPermutations(int arr[]){
        List<List<Integer>> result = new ArrayList<>();
        boolean used[] = new boolean[arr.length];
        generateSubset(arr,used,new ArrayList<>(),result);
        for(List<Integer> subset:result){
            for(int num:subset){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int arr[] = new int[]{1,2,3};
        getPermutations(arr);
    }
}
