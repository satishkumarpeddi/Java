import java.util.*;
class AdditionMatrix extends Thread{
    private int row;
    private int[][] M1;
    private int[][] M2;
    private int[][] result;
    public AdditionMatrix(int row,int[][] M1,int[][] M2,int[][] result){
        this.row=row;
        this.M1=M1;
        this.M2=M2;
        this.result=result;
    } 
    @Override
    public void run(){
        for(int i=0;i<M1[0].length;i++){
            result[row][i] = M1[row][i]+M2[row][i];
        }
    }
}
public class AdditionOfMatrixUsingThread {
    public static void main(String[] args){
        int rows = 4;
        int cols = 4;
          int[][] M1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {7, 16, 9}
        };

        int[][] M2 = {
                {9, 8, 7},
                {6, 5, 4},
                {4, 5, 6},
                {3, 2, 1}
        };
        int[][] result = new int[rows][cols];
        Thread[] thread = new Thread[rows];
        for(int i=0;i<rows;i++){
            thread[i]= new AdditionMatrix(i, M1, M2, result);
            thread[i].start();
        }
        for(int i=0;i<rows;i++){
            try{
                // Thread.sleep(400);
                thread[i].join();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Resultant Matrix After Addition : ");
        for(int i=0;i<rows;i++){

            System.out.print("[ ");
            for(int j=0;j<cols;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println(" ]");
        }
    }
}
