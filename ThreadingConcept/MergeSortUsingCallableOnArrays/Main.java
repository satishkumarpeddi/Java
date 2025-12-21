import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args)throws Exception{
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<int[]> future = executorService.submit(new LogicPart(arr));
        int[] sorted =  future.get();
        executorService.shutdown();
        System.out.println(Arrays.toString(sorted));

    }
}
