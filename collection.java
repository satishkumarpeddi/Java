import java.util.*;
public class collection {
    public static void main(String[] args){
        Collection<String>  s1 = new ArrayList<String>();
    s1.add("Hello");
    s1.add("World");
    Collection<String> s2 = new HashSet<>();
    s2.add("A");
    s2.add("G");
    s2.add("W");
    System.out.println(s1);
    System.out.println(s2);
    s2.addAll(s1);
    System.out.println(s2);   
    }
    
}
