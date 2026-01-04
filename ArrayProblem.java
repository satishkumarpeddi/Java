import java.util.*;
public class ArrayProblem{

    public static void main(String[] args){
        int arr[] = new int[]{0,1,2,0,1,2};
        int l,m,h=arr.length-1;
        // l=m=0;
        // while(m<=h){
        //     if(arr[m]==0){
        //         int temp=arr[l];
        //         arr[l]=arr[m];
        //         arr[m]=temp;
        //         l++;
        //         m++;
        //     }
        //     else if(arr[m]==1){
        //         m++;
        //     } else {
        //         int temp=arr[h];
        //         arr[h]=arr[m];
        //         arr[m]=temp; 
        //         h--;
        //     }
        // }
        int index=0;
        for(int element : arr){
            if(element!=0)
                arr[index++]=element;
             
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println(Arrays.toString(arr));
    }
}