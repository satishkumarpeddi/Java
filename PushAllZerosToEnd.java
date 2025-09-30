

public class PushAllZerosToEnd {
    public static void rigthRotation(int arr[],int start,int rotation){
        int n=arr.length;
        rotation = rotation%n;
        for(int i=0;i<rotation;i++){
            int ele = arr[start];
            for(int j=start;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=ele;
        }
    }
    public static void pushAllZeroToRight(int arr[]){
        // int i=0;
        // while(i!=arr.length){
        //     if(arr[i]==0){
        //         rigthRotation(arr,i,1);
        //     } 
        //     i++;
        // }
        int insertPosition =  0;
        for(int num:arr){
            if(num!=0){
                arr[insertPosition++]=num;
            }
        }
        while(insertPosition<arr.length){
            arr[insertPosition++]=0;
        }
    }
    public static void main(String[] args){
        int arr[] = {-12, 0, 0, 0, 12, 13, 0, 14, 11, 10, 12};
        pushAllZeroToRight(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
