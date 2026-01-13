package BinarySearchPatterns;

public class BinarySearchDuplicatesUsingFlowandSlowPointer {
    public static int duplicatesSearchingMethod(int arr[]){
        int slow = arr[0];
        int fast = arr[0];
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }while(slow!=fast);
        slow = arr[0];
        while(slow!=fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args){
        int arr[] = new int[]{4, 3, 2, 7, 8, 2, 1,6,5};
        //The array size should be n+1 according to pigeonhole principle
        int result = duplicatesSearchingMethod(arr);
        System.out.println("The duplicate element present in the source array : "+result);
    }
}
