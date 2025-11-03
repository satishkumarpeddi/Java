package AddingTwoStringNumbers;

public class StringBuilderApproach {
    public static void main(String[] args){
        StringBuilder strbuilder = new StringBuilder();
        String num1 ="1312";
        String num2 = "2342";
        int i=num1.length()-1,j=num2.length()-1,carry=0;
        while(i>=0||j>=0||carry>0){
            int sum = carry;
            if(i>=0) sum+=num1.charAt(i--)-'0';
            if(j>=0) sum+=num2.charAt(j--)-'0';
            strbuilder.append((char)('0'+(sum%10)));
            carry = sum/10;
        }
        System.out.println(strbuilder.reverse().toString());
    }
}
