package GFG;
import java.util.*;
import java.io.*;
import java.util.stream.IntStream;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Insertion{
    public Node insertionAtEnd(Node head,int data){
        if(head==null) return new Node(data);
        Node newNode = new Node(data);
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
}
class Traversal{
    public void traversalMethod(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" --> ");
            temp=temp.next;
        }
        System.out.println("\n");
    }
}
class Rotation{
    public Node rotateMethod(Node head){
        Node temp = head;
        Node prev=null;
        while(temp.next!=null){
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        temp.next=head; 
        System.out.println(temp.data);
        return temp;
        
    }
}
public class RotateALinkedList {
    static Node head= null;
    public static void main(String[] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of nodes in the linked list : ");
        int n = sc.nextInt();
        Insertion insertion = new Insertion(); // For Insertion of elements in the singled linked list
        Traversal traversal = new Traversal(); // For Traversal of elements or nodes in the singled linked list
        Rotation rotation = new Rotation(); // For Rotation of elements or nodes in the singled linked list
        IntStream.range(0,n).forEach(i->{
            try{
                System.out.println("Enter value for the node : ");
                int data=sc.nextInt();
                head = insertion.insertionAtEnd(head, data);
            }catch(Exception e){    
                System.out.println(e.getMessage());
            }
        });
        System.out.println("The traversal of linked list Before Rotation element's : ");
        traversal.traversalMethod(head);
        head = rotation.rotateMethod(head);
        head = rotation.rotateMethod(head);
        head = rotation.rotateMethod(head);
        head = rotation.rotateMethod(head);
        System.out.println("The traversal of linked list After Rotation element's : ");
        traversal.traversalMethod(head);
    }
}
