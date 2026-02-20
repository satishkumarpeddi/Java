package GFG;
import java.util.*;
public class MaximumNumber{
    public static void main(String[] args){
        int arr[] = new int[]{3,30,34,5,9};
        List<String> list = new ArrayList<>();
        for(int num:arr){
            list.add(num+"");
        }
        list.sort((a,b)->(b+a).compareTo(a+b)); //To get larger number 
        list.sort((a,b)->(a+b).compareTo(b+a)); //To get smaller number
        if(list.get(0).equals("0")){
            System.out.println("0");
            System.exit(0);
        }
        StringBuilder res = new StringBuilder();
        for(String num:list)
            res.append(num);
        System.out.println(res.toString());
    }
}