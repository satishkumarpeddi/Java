import java.io.IOException;
import java.util.*;
import java.util.stream.IntStream;
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
class BSTstructure{
    Node root;
    BSTstructure(){
        root=null;
    }
}
class Insertion{
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        if(data<root.data){
            root.left = insert(root.left,data);
        }else if(data>root.data){
            root.right = insert(root.right,data);
        }else{
            return root;
        }
        return root;
    }
}
class Deletion{
    public static Node findMin(Node root){
        Node current = root;
        while(current.left!=null){
            current=current.left;
        }
        return current;
    }
    public static Node deletion(Node root,int data){
        if(root==null){
            return null;
        }
        if(data<root.data){
            root.left= deletion(root.left, data);
        }else if(data>root.data){
            root.right = deletion(root.right,data);
        }else{
            if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else{
                Node successorNode =  findMin(root.right);
                root.data=successorNode.data;
                root.right = deletion(root.right, successorNode.data);
            }
        }
        return root;
    }
}
class Search{
    public static void SearchMethod(Node root,int data){
        if(root==null){
            return;
        }
        Node temp=root;
        if(temp.data==data){
            System.out.println("Element found in the Binary Search Tree.");
            return;
        }
        if(data<temp.data){
         SearchMethod(root.left, data);
        }else if(data>temp.data){
            SearchMethod(root.right, data);
        }else{
            System.out.println("Element not found in Binary Search Tree.");
        }
    }
}
public class BinarySearchTree {
    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.println(root.data+"  ");
            inOrder(root.right);
        }
    }
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
       BSTstructure bsTstructure = new BSTstructure();
        System.out.println("Enter a number of nodes in Binary Search Tree:");
        int nodes = sc.nextInt();
        IntStream.range(0,nodes).forEach(i->{
            try{
                System.out.println("Enter data for node "+(i+1)+" : ");
                int data = sc.nextInt();
                 bsTstructure.root = Insertion.insert(bsTstructure.root, data);
            }catch(Exception error){
                throw new RuntimeException();
            }
        });
        System.out.println("The elements in the BST tree: ");
        inOrder(bsTstructure.root);
        System.out.println("Enter the element to be deleted for the BST: ");
        int element = sc.nextInt();
        bsTstructure.root = Deletion.deletion(bsTstructure.root, element);
        System.out.println("The BST elements after a deletion for the BST: ");
        inOrder(bsTstructure.root);
        System.out.println("Enter the element to be searched in the Binary Search Tree: ");
        int searchElement = sc.nextInt();
        Search.SearchMethod(bsTstructure.root, searchElement);
    }
}
