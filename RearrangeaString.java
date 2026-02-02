import java.util.Arrays;

public class RearrangeaString {
    public static void main(String[] args){
        String s = "A0";
        char[] ch = s.toCharArray();
        Arrays.sort(ch); 
        int sum=0;
        StringBuilder result = new StringBuilder();
        for(int i=0;i<ch.length;i++){
            if(Character.isDigit(ch[i])){
                sum+=Integer.valueOf(ch[i]-'0'); 
            }
            else
                result.append(ch[i]);
        } 
        if(sum!=0){
            result.append(String.valueOf(sum));
        }
        System.out.println(result);
    }
}
