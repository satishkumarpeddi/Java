 
public class ReverseWords {
    public static void main(String[] args){
        String str = ".v.f..gfc";
        char[] charArray = str.toCharArray();
        String sample ="";
        String result = "";
        for(int i=charArray.length-1;i>=0;i--){ 
            if(charArray[i]!='.'){
                sample+=charArray[i]; 
            }else{
                StringBuilder strBuilder = new StringBuilder(sample);
                result+=strBuilder.reverse();
                if(Character.isLetter(charArray[i]))
                    result+=" ";
                sample="";
            }
        }

        System.out.println(result);
    }
}
