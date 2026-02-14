package Leetcode;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Insert{
    public static Node insertAtEnd(Node head,int data){
        Node newNode = new Node(data);
        if(head==null) return newNode;
        Node temp = head;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=newNode;
        return head;
    }
}

// Main - Program Structure

public class CountlooplengthInLinkedList {
    public int solve(Node root){
    if(root==null&&root.next==null) return -1;
    Node slow = root;
    Node fast = root;
    int count = 1;
    boolean hasLoop = false;
    while(fast!=null&&fast.next!=null){
        fast = fast.next.next;
        slow = slow.next;
        if(slow==fast){
            hasLoop=true;
            break;
        }
    }
    if(!hasLoop) return -1;
    fast=fast.next;
    if(hasLoop){
        while(fast!=slow){
            fast=fast.next;
            count++;
        }
    }
    return count;
}
    public static void main(String[] args){

    }
}
