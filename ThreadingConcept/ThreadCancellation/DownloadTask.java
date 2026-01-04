package ThreadCancellation;
class Task extends Thread{
    private volatile boolean cancelled = false;
    public void cancel(){
        cancelled = true;
    }
    @Override
    public void run(){
        while(!cancelled){
            System.out.println("Downloading.....");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Download Interrupted");
                return;
            }
        }
        System.out.println("Download cancelled. Cleaning up...");
    }
}
public class DownloadTask {
    public static void main(String[] args)throws InterruptedException{
        Task task = new Task();
        task.start();
        Thread.sleep(3000);
        task.cancel();
    }
}
