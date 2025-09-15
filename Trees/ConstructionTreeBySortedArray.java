package Trees;

class Node{
    int data;
    Node left;
    Node right;
    Node(){
        this.data=0;
        this.right=null;
        this.left=null;
    }
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class ConstructionTreeBySortedArray {
    public static Node insertionIntoBST(int arr[],int low,int high){
        if(low>high) return null;
        int mid = low+(high-low)/2;
        Node root = new Node(arr[mid]);
        root.left = insertionIntoBST(arr, low, mid-1);
        root.right = insertionIntoBST(arr,mid+1,high);
        return root;
    }
    public static Node buildBST(int arr[]){
        return insertionIntoBST(arr,0,arr.length-1);
    }
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ---> ");
        inOrder(root.right);
    }
    public static void main(String[] args){
        Node root = new Node();
        int arr[] = {-10,-3,0,5,9};
        root = buildBST(arr);
        inOrder(root);
    } 
}
