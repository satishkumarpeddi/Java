import java.util.ArrayList;
import java.util.Iterator;
public class arrayList {
    public static void main(String[] args){
        ArrayList list = new ArrayList<>();
        list.add(Integer.valueOf(1));
        list.add(Integer.valueOf(2));
        list.add("String");
        list.add("Value");
        //Iterator is common for all collections
        Iterator it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
