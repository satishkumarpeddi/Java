package FastScanner;
import java.io.*;
public class BubbleSortUsingFastScanner {
    static class FastScanner{
        private final byte[] buffer = new byte[1<<16];
        private int ptr=0,len=0;
        private int readByte()throws IOException{
            if(ptr>=len){
                len = System.in.read(buffer);
                ptr=0;
                if(len<=0) return -1;
            }
            return buffer[ptr++];
        } 
        int nextInt()throws IOException{
            int val=0;
            int c;
            int sign=1;
            do c=readByte(); while(c<=' ');
            while(c=='-'){
                sign=-1;
                c=readByte();
            }
            while(c>' '){
                val= val*10+(c-'0');
                c=readByte();
            }
            return val*sign;
        }
         
    }
    static void bubbleSort(int[] arr){
        int n = arr.length;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }
            if(!swapped) break;
        }
    }
    public static void main(String[] args)throws IOException{
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = fs.nextInt();
        bubbleSort(arr);
        StringBuffer sb = new StringBuffer();
        for(int x:arr)
            sb.append(x).append(" ");
        System.out.println("Bubble Sorted Array : "+sb.toString().trim());
    }
}
