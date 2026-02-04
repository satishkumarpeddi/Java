package GFG;
import java.util.HashMap; 

public class MajorityElement {
   public static void main(String[] args){
    int arr[] = {2,13};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<arr.length;i++){
        map.put(arr[i],map.getOrDefault(arr[i],0)+1);
    }
    int mostFreq=0;
    int element = 0;
    for(HashMap.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()>mostFreq){
            mostFreq = entry.getValue();
            element = entry.getKey();
        } 
    }
    if(mostFreq==1){
        System.out.println("Output : "+-1);
    }else
    System.out.println("Most frequently repeated element : "+element);
   } 
}
