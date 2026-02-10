package GFG;
import java.util.*;
public class CheckEqualArrays{
    public static void main(String[] args){
        int a[] = {1,2,5,4,0};
        int b[] = {2,4,5,0,1};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:a){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:b){
            if(map.containsKey(num)&&map.get(num)>0){
                map.put(num,map.getOrDefault(num,0)-1);
            }else{
                System.out.println("The both Arrays or not equal");
                System.exit(0);
            }
        }
        System.out.println("The both Arrays are equal.");
    }
}