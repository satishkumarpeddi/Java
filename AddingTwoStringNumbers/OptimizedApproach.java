package AddingTwoStringNumbers;

public class OptimizedApproach {
    public static void main(String[] args){
        String num1 = "342342";
        String num2 = "3438483";
        char[] result = new char[Math.max(num1.length(),num2.length())+1];
        int k = result.length-1;
        int i = num1.length()-1,j=num2.length()-1,carry=0;
        while(i>=0||j>=0||carry>0){
            int sum = carry;
            if(i>=0) sum+=num1.charAt(i--)-'0';
            if(j>=0) sum+=num2.charAt(j--)-'0';
            result[k--] = (char)('0'+(sum%10));
            carry=sum/10;
        }
        System.out.println(new String(result,k+1,result.length-k-1));
    }
}
