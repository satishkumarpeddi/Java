import java.util.Scanner;
public class swapTwoNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int arr[]  = new int[n];
        System.out.print("Enter elements into array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number at which the sort should be take place: ");
        int m=sc.nextInt();
        int left =m+1;
        int right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        System.out.println("After swapping the array elements: ");
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
