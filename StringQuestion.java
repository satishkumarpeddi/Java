public class StringQuestion {
    public static void main(String[] args){
        String str1="abce";
        String str2="abc";
        String combineString = str1+str2;
        int ans=0;
        for(int i=0;i<combineString.length();i++){
            char ch = combineString.charAt(i);
            ans^=ch-'a';
        }
        System.out.println((char)(ans+'a'));
    }
}
