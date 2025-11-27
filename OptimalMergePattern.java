import java.util.*;
public class OptimalMergePattern {
    public static void main(String[] args){
        int files[] = new int[]{2,4,5,1,9,20};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<files.length;i++){
            pq.add(files[i]);
        }
        int count = 0;
        while(pq.size()>1){
            int temp = pq.poll()+pq.poll();
            count+=temp;
            pq.add(temp);
        }
        System.out.println("Minimum Computation : "+count);
    }
}
