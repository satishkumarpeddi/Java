package GFG;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class PalindromeOfLinkedList {
    public static Node reverse(Node head){
        Node curr=head;
        Node prev=null;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static boolean isPalindrome(Node head){
        if(head==null||head.next==null) return true;
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node firstHalf = head;
        Node secondHalf = reverse(slow);
        while(secondHalf!=null){
            if(firstHalf.data!=secondHalf.data)
                return false;
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }
    public static void main(String[] args){
        //Main Logic for insertion of elements into the linked list (ie.Singled Linked List)
    }
}
