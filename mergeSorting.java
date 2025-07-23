public class mergeSorting{
    public static void merge(int arr[],int low,int mid, int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] left = new int[n1];
        int[] right = new int[n2];
        for(int i=0;i<n1;i++){
            left[i]=arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        int k=low;
        int i,j;
        i=j=0;
        while(i<n1&&j<n2){
            if(left[i]<=right[j]){
                arr[k]=left[i];
                i++;
            }else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=right[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int arr[], int low, int high){
        if(low<high){
            int mid = low+(high-low)/2;
            mergeSort(arr, low, mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args){
        int[] elements = {2,31,24,54,65,78,98};
        mergeSort(elements,0,elements.length-1);
        System.out.println("The sorted array elements using merga sort algo");
        for(int element:elements){
            System.out.print(element+" ");
        }
    }
}