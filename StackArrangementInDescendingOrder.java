import java.util.*;
public class StackArrangementInDescendingOrder{
    public static void sortStackDescending(Stack<Integer> stack){
        if(stack.isEmpty())
            return;
        int top = stack.pop();
        sortStackDescending(stack);
        insertInDescendingOrder(stack,top);
    }
    public static void insertInDescendingOrder(Stack<Integer> stack,int element){
        if(stack.isEmpty()||stack.peek()>=element){
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInDescendingOrder(stack, element);
        stack.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(2);
        stack.push(4);
        System.out.println("Original Stack: "+stack);
        sortStackDescending(stack);
        System.out.println("Descending sorted stack: "+stack);
    }
}