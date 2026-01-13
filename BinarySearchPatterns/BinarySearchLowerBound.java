package BinarySearchPatterns; 
public class BinarySearchLowerBound{
    public static int lowerBoundMethod(int arr[],int x){
        int low=0,high=arr.length;
        while(low<high){
            int mid = low+(high-low)/2;
            if(arr[mid]>=x){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
      
    public static void main(String[] args){
        int arr[] = new int[]{1,2,4,4,5,7};
        int x= 4;
        int result = lowerBoundMethod(arr, x);
        System.out.println("Lower Bound of 4 in a array  : "+result);
    }
}