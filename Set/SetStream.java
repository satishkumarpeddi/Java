package Set;

import java.util.*;

public class SetStream{
    public static void main(String[] args){
        int[] arr = new int[]{12,3,45,2,2,3,45,12};
        Arrays.sort(arr);
        Set<Integer> set  = new HashSet<>();
        for(int num:arr)
                set.add(num);
        int[] result = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(result));
    }
}