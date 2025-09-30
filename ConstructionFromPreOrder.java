import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
class BSTPreOrder{
    public static Node constructTree(int[] preOrder,int size){
        if(size==0) return null;
        Stack<Node> stack = new Stack<>();
        Node root = new Node(preOrder[0]);
        stack.push(root);
        for(int i=1;i<size;i++){
            Node temp=null;
            while(!stack.isEmpty()&&preOrder[i]>stack.peek().data){
                temp=stack.pop();
            }
            if(temp!=null){
                temp.right=new Node(preOrder[i]);
                stack.push(temp.right);
            }else{
                temp=stack.peek();
                temp.left= new Node(preOrder[i]);
                stack.push(temp.left);
            }
        }
        return root;
    }
}
public class ConstructionFromPreOrder {
    public static void postOrder(Node root){
        if(root!=null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data+"  ");
        }
    }
    public static void main(String[] args){
        int preOrder[] = {10,5,1,7,40,50};
        BSTPreOrder bstPreOrder = new BSTPreOrder();
        Node root = bstPreOrder.constructTree(preOrder, preOrder.length);
        postOrder(root);
    }
}
