public class quickSorting{
    public static int paration(int arr[], int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    public static void quickSort(int arr[],int low, int high){
        if(low<high){
            int pi = paration(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    public static void main(String[] args){
        int[] numbers = {4,6,5,8,21,32,54};
        quickSort(numbers,0,numbers.length-1);
        System.out.println("The elements are sorted using quick sort algo");
        for(int number: numbers){
            System.out.print(number+" ");
        }
    }
}