public class ReplaceCharacterArray {
  public static void main(String[] args){
    char arr[] = "aabbcced".toCharArray();
    for(int  i=1;i<arr.length;i++)
        if(arr[i]==arr[i-1])
            arr[i]='#';
    System.out.println(String.valueOf(arr));
  }   
}
