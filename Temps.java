public class Temps {
    public static void main(String[] args){
        String str = "";
        String sentences = "A man, a plan, a canal: Panama";
        for(int i=0;i<sentences.length();i++){
            char ch = sentences.charAt(i);
            if(Character.isLetter(ch))
                str+=Character.toLowerCase(ch);
        }
        String temp=str;
        String check="";
        for(int i=str.length()-1;i>=0;i--)
            check+=str.charAt(i);
        if(check.equals(str))
            System.out.println(true);
    }
}
