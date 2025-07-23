import java.util.*;
public class UniqueNumber{
    public static void main(String[] args){
        int arr[] = new int[]{4,5,1,2,2,5,4,3};
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for(int  num: arr){
            if(map.get(num)==1){
                System.out.println("The unqiue number is the set: "+num);
                break;
            }
        }
    }
}