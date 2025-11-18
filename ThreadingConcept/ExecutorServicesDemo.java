import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class ExecutorServicesDemo {
    public static void main(String[] args){
        ExecutorService executors = Executors.newFixedThreadPool(3);
        for(int i=1;i<=5;i++){
            int taskId =i;
            executors.submit(()->{
                System.out.println("Task "+taskId+" is running on "+Thread.currentThread().getName());
                try{
                    Thread.sleep(100);
                }catch(Exception e){
                    e.printStackTrace();
                }
            });
        }
        executors.shutdown();
        System.out.println("All tasks submitted.");
    }
}
