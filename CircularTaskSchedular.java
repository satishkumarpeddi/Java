public class CircularTaskSchedular{
    public static void main(String[] args){
        String[] tasks = {"Email","Backup","Report","Cleanup"};
        int totalIterations = 10;
        for(int i=0;i<totalIterations;i++){
            //Use modular arithmetic to loop back to the start
            String currentTask = tasks[i%tasks.length];
            System.out.println("Executing task: "+currentTask);
        }
    }
}