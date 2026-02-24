package GFG;
import java.util.*;
public class FindInteger {
    public static void main(String[] args){
        int n  =100; 
        int odd[] = new int[n];
        int even[] = new int[n];
        int finalArr[] = new int[n];
        for(int i=1;i<=n;i++){
            if(i%2==0) even[i-1] = i;
            else odd[i-1]=i;
        }
        // System.out.println(odd.length+" "+even.length);
        int[] filterOdd = Arrays.stream(odd).filter(num->num!=0).toArray();
        int[] filterEven = Arrays.stream(even).filter(num->num!=0).toArray();
        for(int i=0;i<(n+1)/2;i++){ 
                finalArr[i]=filterOdd[i]; 
        }
        int j=0;
        for(int i=((n+1)/2);i<n;i++){ 
                finalArr[i]=filterEven[j++]; 
        }
        // System.out.println(Arrays.toString(filterEven)+" "+Arrays.toString(filterOdd));
        System.out.println(Arrays.toString(finalArr));
    }
}
