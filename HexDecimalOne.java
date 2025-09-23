public class HexDecimalOne{
    public static String decimalHex(int decimal){
        char[] hexArr = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<8&&decimal!=0;i++){
            int num = decimal&0xf;
            sb.append(hexArr[num]);
            decimal>>>=4;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args){
        int num = 960;
        System.out.println(decimalHex(num));
    }
}