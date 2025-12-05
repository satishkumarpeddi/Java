import java.util.*;
class MultiplicationMatrix extends Thread{
    private int[][] M1;
    private int[][] M2;
    private int[][] result;
    private int row;
    public MultiplicationMatrix(int[][] M1,int[][] M2,int row,int result[][]){
        this.M1=M1;
        this.M2=M2;
        this.row=row;
        this.result=result;
    }
    @Override
    public void run(){
        int length_Of_M2 = M2[0].length;
        int length_Of_M1_M2 = M2.length;
        for(int j=0;j<length_Of_M2;j++){
            result[row][j]=0;
            for(int k=0;k<length_Of_M1_M2;k++){
                result[row][j]+=M1[row][j]*M2[k][j];
            }
        }
    }
}
public class MultiplicationOfMatrixUsingThreadClass {
    public static void main(String[] args){
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
        int rowM1= M1.length;
        int colM2= M2[0].length;
        int[][] result = new int[rowM1][colM2];
        MultiplicationMatrix[] thread = new MultiplicationMatrix[rowM1];
        for(int i=0;i<rowM1;i++){
            thread[i]=new MultiplicationMatrix(M1, M2, i,result);
        }
        for(int i=0;i<rowM1;i++){
            thread[i].start();
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
