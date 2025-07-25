public class sortedRoatedArray {
    public static void main(String[] args){
        int arr[] = new int[]{3,4,5,1,2};
        int n=5;
        int i=0;
        int breakPoint =0;
        while(i<n){
            int temp = arr[i];
            int next = arr[(i+1)%n];
            if(temp>next){
                breakPoint++;
            }
            i++;
        }
        if(breakPoint>1){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}
