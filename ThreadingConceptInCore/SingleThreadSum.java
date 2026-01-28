package ThreadingConceptInCore;

public class SingleThreadSum {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
        long sum = 0;
        for(long i=1;i<=1_000_000_000L;i++){
            sum+=i;
        }
        long end = System.currentTimeMillis();
        System.out.println("Sum = "+sum);
        System.out.println("Single-thread time : "+(end-start)+" ms");
    }
}
