package GFG;
import java.util.*;
public class NextElementWithGreaterFrequency {
    public static void main(String[] args){
        int arr[] = {5,1,5,6,6};
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<arr.length;i++){ 
                map.put(arr[i],map.getOrDefault(arr[i], 0)+1); 
        } 
        System.out.println(map);
        int i = arr.length-1;
        ArrayList<Integer> result = new ArrayList<>();
        while(i>=0){
            while(!stack.isEmpty()&&(map.get(stack.peek())<=map.get(arr[i]))){
                stack.pop();
            }
            if(stack.isEmpty()){
                result.add(-1);
            }else{
                result.add(stack.peek());
            }
            stack.push(arr[i]);
            i--;
        }
        Collections.reverse(result);
        System.out.println(result);
    }
}
