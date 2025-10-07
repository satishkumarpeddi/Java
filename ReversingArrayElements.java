public class ReversingArrayElements{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        for(int i=0;i<arr.length/2;i++){
            arr[i]^=arr[arr.length-1-i];
            arr[arr.length-1-i]^=arr[i];
            arr[i]^=arr[arr.length-1-i];
        }
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}