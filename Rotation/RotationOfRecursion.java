package Rotation;

public class RotationOfRecursion {
    public static void leftRotation(int arr[],int start,int end){
        if(start==end) return;
        int temp = arr[start];
        arr[start]=arr[start+1];
        arr[start+1]=temp;
        leftRotation(arr, start+1, end);
    }
    public static void rightRotation(int arr[],int end){
        if(end==0) return;
        int temp= arr[end];
        arr[end]=arr[end-1];
        arr[end-1]=temp;
        rightRotation(arr, end-1);
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int k =2;
        leftRotation(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        rightRotation(arr, arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
