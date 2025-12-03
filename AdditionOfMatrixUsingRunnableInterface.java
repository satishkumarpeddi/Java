import java.util.*;
class AdditionOfMatrix implements Runnable{
    private int row;
    private int[][] _A;
    private int[][] _B;
    private int[][] _result;
    public AdditionOfMatrix(int row,int[][] _A,int[][] _B,int _result[][]){
        this.row=row;
        this._A=_A;
        this._B=_B;
        this._result=_result;
    }
    @Override
    public void run(){
        for(int i=0;i<_A[0].length;i++){
            _result[row][i] = _A[row][i]+_B[row][i];
        }
    }
}
public class AdditionOfMatrixUsingRunnableInterface {
    public static void main(String[] args){
       int rows = 4;
        int cols = 3;
          int[][] M1 = {
                {1, 22, 3},
                {4, 5, 6},
                {7, 81, 9},
                {7, 16, 9}
        };

        int[][] M2 = {
                {329, 98, 7},
                {6, 55, 4},
                {4, 51, 6},
                {3, 2, 109}
        };
        int[][] result = new int[rows][cols];
        Thread[] thread = new Thread[rows];
        for(int i=0;i<rows;i++){
            thread[i]= new Thread(new AdditionMatrix(i, M1, M2, result));
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
            System.out.println("]");
        }

    }
}
