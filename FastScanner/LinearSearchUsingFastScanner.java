package FastScanner;
import java.io.*;
import java.util.*;
public class LinearSearchUsingFastScanner {
    static class FastScanner{
        private final byte[] buffer = new byte[1<<16];
        private int ptr = 0,len=0;
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
            int sign=1;
            int c;
            do c = readByte(); while(c<=' ');
            while(c=='-'){
                sign=-1;
                c=readByte();
            }
            while(c>' '){
                val = val*10+(c-'0');
                c=readByte();
            }
            return val*sign;
        }
    }
    public static void main(String[] args)throws IOException{
        FastScanner fs = new FastScanner();
        int n = fs.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = fs.nextInt();
        }
        System.out.println("Array : "+Arrays.toString(arr));
        int searchElement = fs.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==searchElement){
                System.out.println("Element found.");
                System.exit(0);
            }
        }
        System.out.println("Element not found.");
    }
}
