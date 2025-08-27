import java.util.*;
public class LastWeightStone {
    public static int lastWeightOfStone(int arr[]){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int num:arr)
            pq.add(num);
        while(pq.size()>1){
            int a = pq.poll();
            int b = pq.poll();
            if(a!=b) pq.add(a-b);
        }
        return pq.isEmpty()?0:pq.peek();
    }
    public static void main(String[] args){
        int arr[] = {2,7,4,1,8,1};
        int result = lastWeightOfStone(arr);
        System.out.println(result);
    }
}
