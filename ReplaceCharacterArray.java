import java.util.*;
public class ReplaceCharacterArray {
  public static void main(String[] args){
    String str = "aabc";
    Queue<Character> queue = new LinkedList<>();
    HashMap<Character,Integer> map = new HashMap<>();
    StringBuilder resultString = new StringBuilder();
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        queue.add(ch);
        map.put(ch,map.getOrDefault(ch,0)+1);
        while(!queue.isEmpty()&&map.get(queue.peek())>1)
            queue.poll();
        if(queue.isEmpty())
            resultString.append('#');
        else
            resultString.append(queue.peek());
    }
    System.out.println("The result string : "+resultString.toString());
  }   
}
