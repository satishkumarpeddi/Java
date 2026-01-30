package GFG;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Arrays;
import java.util.Stack;
public class InterleaveOfQueue{
    public static void replaceElement(Queue<Integer> queue,int oldElement,int newElement){
        int size = queue.size();
        for(int i=0;i<size;i++){
            Integer current = queue.poll();
            if(current.equals(oldElement))
                queue.offer(newElement);
            else
                queue.offer(current);
        }
    }
    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(4);
        queue.add(3);
        queue.add(1);
        Stack<Integer> stack = new Stack<>();
        int half= queue.size()/2;
        for(int i=0;i<half;i++)
            stack.push(queue.poll());
        for(int i=0;i<half;i++)
            queue.offer(stack.pop());
        for(int i=0;i<half;i++)
            queue.offer(queue.poll());
        for(int i=0;i<half;i++)
            stack.push(queue.poll());
        for(int i=0;i<half;i++){
            queue.offer(stack.pop());
            queue.offer(queue.poll());
        }
        //After Interleave 
        System.out.println(queue);
    }
}