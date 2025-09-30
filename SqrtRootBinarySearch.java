public class SqrtRootBinarySearch {
    public static double binarySearch(double number, double precision){
        if(number<0)
            return Double.NaN;
        if(number==0)
            return 0;
        double low =0.0;
        double high = Math.max(1.0,number);
        while((high-low)>precision){
           double mid = low+(high-low)/2;
           double square = mid*mid;
           if(square>number){
            high=mid;
           }else{
            low=mid;
           }

        }
        return Math.round(low);
    }
    public static void main(String[] args){
        double num = 27;
        final double PRECISION = 1e-7;
        System.out.println(PRECISION);
        System.out.println("The square root of "+num+"is approximately: "+binarySearch(num,PRECISION));
    }
}
