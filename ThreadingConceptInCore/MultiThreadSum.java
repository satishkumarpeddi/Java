package ThreadingConceptInCore;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class MultiThreadSum {
    static class SumTask implements Runnable{
        private final long start;
        private final long end;
        SumTask(long start,long end){
            this.start=start;
            this.end=end;
        }
        @Override
        public void run(){
            long sum=0;
            for(long i=start;i<=end;i++){
                sum+=i;
            }
        }
    }
    public static void main(String[] args)throws InterruptedException{
        long startTime = System.currentTimeMillis();
        int threads = 4;
        ExecutorService exectuor = Executors.newFixedThreadPool(threads);
        long range = 1_000_000_000L/threads;
        for(int i=0;i<threads;i++){
            long start = i*range+1;
            long end = (i==threads-1)?1_000_000_000L:start+range-1;
            exectuor.execute(new SumTask(start,end));
        }
        exectuor.shutdown();
        exectuor.awaitTermination(1, TimeUnit.HOURS);
        long endTime = System.currentTimeMillis();
        System.out.println("Multi-thread time: "+(endTime-startTime));
    }
}
