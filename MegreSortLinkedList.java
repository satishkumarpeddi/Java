import java.util.*;
import java.util.stream.IntStream;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class ListOfNodes{
    Node head;
    ListOfNodes(){
        this.head=null;
    }
}
class Insertion{
    public static Node insertionAtEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head==null)
            return newNode;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return head;
    }
}
class Display{
    public static void displayMethod(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
}
public class MegreSortLinkedList {
    public static Node split(Node node){
        if(node==null||node.next==null)
            return null;
        Node slow=node;
        Node fast=node.next;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast=fast.next.next;
        }
        Node second = slow.next;
        slow.next=null;
        return second;
    }
    public static Node merge(Node first, Node second){
        if(first==null) return second;
        if(second==null) return first;
        if(first.data<=second.data){
            first.next=merge(first.next, second);
            return first;
        }else{
            second.next=merge(first, second.next);
            return second;
        }
    }
    public static Node mergeSort(Node head){
        if(head==null||head.next==null)
            return head;
        Node second = split(head);
        head=mergeSort(head);
        second=mergeSort(second);
        return merge(head,second);
    }
    public static void main(String[] args){
        ListOfNodes list = new ListOfNodes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of nodes in the Linked List: ");
        int n= sc.nextInt();
        IntStream.range(0, n).forEach(i->{
            try{
                System.out.print("Enter value of node "+(i+1)+": ");
                int data= sc.nextInt();
                list.head=Insertion.insertionAtEnd(list.head, data);
            }catch(Exception error){
                throw new RuntimeException(error);
            }
        });
        System.out.println("The Original Linked List: ");
        Display.displayMethod(list.head);
        list.head = mergeSort(list.head);
        System.out.println("The Sorted Linked List: ");
        Display.displayMethod(list.head);
    }
}
