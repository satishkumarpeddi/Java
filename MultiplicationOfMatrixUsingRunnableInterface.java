import java.util.*;
import java.io.*;
class MultiplicationMatrixInterface implements Runnable{
    private int row;
    private int[][] result;
    private int[][] M1;
    private int[][] M2;
    public MultiplicationMatrixInterface(int row,int[][] result,int[][] M1,int[][] M2){
        this.row=row;
        this.M1=M1;
        this.M2=M2;
        this.result=result;
    }
    @Override
    public void run(){
        int colsM2 = M2[0].length;
        int colM1_M2 = M2.length;
        for(int j=0;j<colsM2;j++){
            result[row][j]=0;
            for(int k=0;k<colM1_M2;k++){
                try{
                    result[row][j]+=M1[row][k]*M2[k][j];
                    Thread.sleep(500);
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
public class MultiplicationOfMatrixUsingRunnableInterface {
     public static void main(String[] args)throws InterruptedException{
        int[][] M1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {7, 16, 9}
        };

        int[][] M2 = {
                    {9, 8, 7},
                    {6, 5, 4},
                    {4, 5, 6}
        };
        int rowM1= M1.length;
        int colM2= M2[0].length;
        int[][] result = new int[rowM1][colM2];
        Thread[] thread= new Thread[rowM1];
        // MultiplicationMatrixInterface[] thread = new MultiplicationMatrixInterface[rowM1];
        for(int i=0;i<rowM1;i++){
            thread[i]=new Thread(new MultiplicationMatrixInterface(i,result,M1,M2));
        }
        for(int i=0;i<rowM1;i++){
            thread[i].start();
        }
        for(int i=0;i<rowM1;i++){
            thread[i].join();
        }
        System.out.println("Matrix Multiplication Using Thread : ");
        for(int i=0;i<rowM1;i++){
            for(int j=0;j<colM2;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
     }
}

