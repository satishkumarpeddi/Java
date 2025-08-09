public class StLeft {
    public static void main(String[] args){
        //              1
        //            2
        //          3
        //        4
        //      5
        int n=5;
        for(int i=1;i<=n;i++){
            for(int s=0;s<=n-i;s++)
                System.out.print("  ");
            System.out.print(i);
        System.out.println();
        }
    }
}
