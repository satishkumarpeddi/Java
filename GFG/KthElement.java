package GFG; 
public class KthElement {
    public static void main(String[] args){
        int arr[]= {5,1,2,3,4}; 
        int low = 0;
        int high = arr.length-1;
        int ans = 0;
        int min = Integer.MAX_VALUE;
        while(low<=high){
            if(arr[low]<=arr[high]){
                if(arr[low]<min){
                    ans = low;
                    min = arr[low];
                }
                break;
            }
            int mid = low+(high-low)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<min){
                    ans = low;
                    min = arr[low];
                }
            }else{
                if(arr[mid]<min){
                    ans = mid;
                    min = arr[low];
                }
            }
        }
        System.out.println("The Kth Element Of The Array : "+ans);
    }
}
