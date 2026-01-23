package PriorityQueueG;
import java.util.*;
class P{
    long sum;
    int index;
    P(long sum,int index){
        this.sum=sum;
        this.index=index;
    }
}
public class SortedArrayHard {
    public static int minimumPairRemoval(int arr[]){
        int n = arr.length;
        if(n<=1) return 0;
        long[] array = new long[n];
        boolean removed[] = new boolean[n];
        for(int i=0;i<n;i++) array[i] = arr[i];
        PriorityQueue<P> pq = new PriorityQueue<>(new Comparator<P>() {
            public int compare(P a,P b){
                if(a.sum<b.sum) return -1;
                if(a.sum>b.sum) return 1;
                return Integer.compare(a.index, b.index);
            }
        });
        int prev[] = new int[n];
        int next[] = new int[n];
        int sorted=0;
        for(int i=1;i<n;i++){
            pq.add(new P(array[i-1]+array[i],i-1));
            if(array[i]>=array[i-1]) sorted++;
        }
        if(sorted==n-1) return 0;
        int rem=n;
        //Prev[-1,0,1,2,3] 
        //Next[0,1,2,3,4]
        for(int i=0;i<n;i++){
            prev[i]=i-1;
            next[i]=i+1;
        }
        while(rem>1){
            P top=pq.poll();//Used to get the element
            if(top==null) break;
            long sum = top.sum;
            int left = top.index;
            int right = next[left];
            if(right>=n||removed[left]||removed[right]||array[left]+array[right]!=sum) continue;
            int pre = prev[left];
            int nxt = next[right];
            if(array[left]<=array[right]) sorted--;
            if(pre!=-1&&array[pre]<=array[left]) sorted--;
            if(nxt!=n&&array[right]<=array[nxt]) sorted--;
            array[left]+=array[right];
            removed[right]=true;
            rem--;
             
            if(pre!=-1){
                pq.add(new P(array[pre]+array[left],pre));
                if(array[pre]<=array[left]) sorted++;
            }else{
                prev[left]=-1;
            }
            if(nxt!=n){
                prev[nxt] = left;
                next[left] = nxt;
                pq.add(new P(array[left]+array[nxt],left));
                if(array[left]<=array[nxt]) sorted++;
            }else{
                next[left]=n;
            }
            if(sorted==rem-1) return n-rem;
        }
        return n;
    }
    public static void main(String[] args){
        int arr[] = new int[]{5,2,3,1};
        int result = minimumPairRemoval(arr);
        System.out.println("The minimum pairs to be removed : "+result);

    }
}
