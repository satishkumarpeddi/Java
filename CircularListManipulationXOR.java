import java.util.*;
public class CircularListManipulationXOR{
    public static int ciruclarList(int N,int K,int arr[]){
        int xorTransformation[] = new int[N];
        //XOR Transformation
        for(int i=0;i<N;i++){
            xorTransformation[i]=arr[i]^arr[(i+1)%N];//It is similar to the common trick used in encryption, hashing,network link processing
        }
        int[] reversed = new int[N];
        for(int i=0;i<N;i+=K){
            int end = Math.min(i+K,N);//Grouping the element's based on the K value and thereafter reversing the element's 
            for(int j=i,l=end-1;j<end;j++,l--){
                reversed[j]=xorTransformation[l];
            }
        }
        int result =0;
        for(int val:reversed) result^=val;
        ArrayList<Integer> finalList = new ArrayList<>();
        if(result%2==0) {
            for(int val:reversed) if(val%2==1)
            finalList.add(val);
        }else{
            for(int val:reversed) if(val%2==0)
            finalList.add(val);
        }
        return finalList.size();
    }
    public static void main(String[] args){
        int result = ciruclarList(5,2,new int[]{3,6,9,12,15});
        System.out.println("The resultant value : "+result);
    }
}