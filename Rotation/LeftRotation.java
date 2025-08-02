package Rotation;

public class LeftRotation {
    public static void leftRotation(int arr[],int k){
        int n = arr.length;
        k = k%n;
        for(int i=0;i<k;i++){
            int firstElement = arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
                arr[n-1]=firstElement;
        }
    }
    public static void rightRotation(int arr[],int k){
        int n = arr.length;
        k=k%n;
        for(int i=0;i<k;i++){
            int lastElement = arr[n-1];
            for(int j=n-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=lastElement;
        }
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int k = 3;
        leftRotation(arr,k);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        rightRotation(arr, k);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
