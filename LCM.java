public class LCM {
    public static int gcd(int a,int b){
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args){
        int a=80,b=3;
        int gcdValue = gcd(a,b);
        int lcmValue = a*b;
        System.out.println(lcmValue/gcdValue);
    }
}
