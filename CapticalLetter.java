public class CapticalLetter {
    public static void main(String[] args){
        String str = "__i am a student of the third year__";
        char[] strArray = str.toCharArray();
        for(int i=0;i<strArray.length-1;i++){
            if(strArray[i]==' '){
                strArray[i+1]=Character.toUpperCase(strArray[i+1]);
            }
        }
        System.out.println(strArray);
    }
}
