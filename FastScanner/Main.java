package FastScanner; 
import java.io.*;
//Scanner Class ===> Slower
//BufferedReader ===> Intermediate
//FastScanner Class ===> Faster

//FastScanner for better input handle 
public class Main{
    public static void main(String[] args)throws IOException{

    }
    static class FastScanner{
        private final byte[] buffer = new byte[1<<16];//For bitwise operation
        private int ptr=0,len=0;
        private final InputStream in;
        FastScanner(InputStream in){
            this.in=in;
        }
        private int read()throws IOException{
            if(ptr>=len){
                len = in.read(buffer);
                ptr=0;
                if(len<=0) return -1;
            }
            return buffer[ptr++];
        }
        long nextLong()throws IOException{
             long val=0;
             int c;
             do c = read(); while(c<=' ');
             while(c>' '){
                val = val*10+(c-'0');
                c=read();
             }
             return val;
        }
        int nextInt()throws IOException{
            return (int)nextLong();
        }
    }
}