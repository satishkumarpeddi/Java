public class CircularConvolution {
    public static int[] padArray(int[] input,int n){
        int result[] = new int[n];
        for(int i=0;i<n;i++){
            if(i<input.length){
                result[i]=input[i];
            }else{
                result[i]=0;
            }
        }
        return result;
    }
    public static int[] ciruclarConvolutionArray(int[] x,int[] h){
        int n = Math.max(x.length,h.length);
        int[] xPad = padArray(x,n);
        int[] hPad = padArray(h,n);
        int[] y = new int[n];
        for(int i=0;i<n;i++){
            y[i]=0;
            for(int j=0;j<n;j++){
                int k = (i-j+n)%n;
                y[i]+=xPad[j]*hPad[k];
            }
        }
        return y;
    }
    public static void main(String[] args){
        int x[] = {5,7,3,2};
        int h[] = {1,5};
        int result[] = ciruclarConvolutionArray(x,h);
        for(int value:result){
            System.out.println(value+"  ");
        }
    }
}
