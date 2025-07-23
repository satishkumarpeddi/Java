public class Set {
    public static void main(String[] args){
        int arr[] = {1,2,3,5,7};
        int i=0,j=0,sum=0,flag=0;
        while(j<arr.length){
            sum+=arr[j];
            if(sum<8){
                j+=1;
            }else if(sum>8){
                i+=1;
                sum-=arr[i];
            }else{
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("False");
        }else
            System.out.println("True");
    }
}
