import java.util.*;
public class ContainsDuplicateII {
    public static void main(String[] args){
        HashMap<Integer,Integer> map = new HashMap<>();
        int num[] = {1,2,3,1};
        int k = 3;
        for(int i=0;i<num.length;i++){
            if(map.containsKey(num[i])){
                int prevIndex = map.get(num[i]);
                if(i-prevIndex<=k){
                    System.out.println("true");
                    return;
                }
            }
            map.put(num[i],i);
        }
        System.out.println("false");
    }
}
