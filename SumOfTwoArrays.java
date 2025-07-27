import java.util.ArrayList;

public class SumOfTwoArrays {
    public static void findSumOfArray(int a[],int b[],int n,int m){
        int i=n-1,j=m-1;
        int carry=0;
        int sum=0;
        ArrayList<Integer> result = new ArrayList<>();
        while(i>=0||j>=0||carry!=0){
            sum = carry;
            if(i>=0) sum+=a[i--];
            if(j>=0) sum+=b[j--];
            result.add(sum%10);
            carry=sum/10;
        }
        System.out.println(result.reversed());
    }
    public static void main(String[] args){
        int a[] = {1,2,3,4};
        int b[] = {6};
        findSumOfArray(a,b,a.length,b.length);
    }
}
