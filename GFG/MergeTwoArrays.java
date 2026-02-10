package GFG;
import java.util.*;
public class MergeTwoArrays {
    public static void main(String[] args){
        int a[] = {2,3,6,7,9};
        int b[] = {1,4,8,10};
         int i=0;
        int j=0;
        int k=0;
        int result[] = new int[a.length+b.length];
        int n1 = a.length;
        int n2 = b.length;
        while(i<n1&&j<n2){
            if(a[i]<b[j]){
                result[k] = a[i];
                i++;
            }else{
                result[k] = b[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            result[k++]=a[i++];
        }
        while(j<n2){
            result[k++]=b[j++];
        }
        System.out.println(Arrays.toString(result)+" "+result[5]);
    }
}
