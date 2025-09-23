public class HexaDecimal {
    public static String decimalToHex(int decimal){
        if(decimal == 0) return "0";
        StringBuilder sb = new StringBuilder();
        char[] hexChar = "0123456789ABCEDF".toCharArray();
        int num = decimal;
        while(num>0){
            int rem = num%16;
            sb.append(hexChar[rem]);
            num/=16;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        int num = 960;
        System.out.println(decimalToHex(num));
    }
}
