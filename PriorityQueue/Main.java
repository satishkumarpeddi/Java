package PriorityQueue;
import java.util.PriorityQueue;
// Heap based data structure
import java.util.Comparator;

class P{
    int sum;
    int idx;
    P(int sum,int idx){
        this.sum=sum;
        this.idx=idx;
    }
    @Override
    public String toString(){
        return "(sum=" + sum + ", idx="+idx+")";
    }
}
public class Main{
    public static void main(String[] args){
        PriorityQueue<P> pq = new PriorityQueue<>(new Comparator<P>(){
            public int compare(P a,P b){
                if(a.sum<b.sum) return -1;
                if(a.sum>b.sum) return 1;
                return Integer.compare(a.idx,b.idx);
            }
        });
        pq.add(new P(10, 2));
        pq.add(new P(5, 3));
        pq.add(new P(10, 1));
        pq.add(new P(5, 1));
        pq.add(new P(7, 4));
        while(!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}