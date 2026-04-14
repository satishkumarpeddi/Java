/**
 * 
 * 
 */
class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
        this.next=null;
    }
}
class Solution {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while(head!=null){
            sum*=2;
            sum+=head.val;
            head=head.next;
        }
        return sum;
    }
}
public class ConvertBinaryNumberinaLinkedListtoInteger {
    public static void main(String[] args){}

}
