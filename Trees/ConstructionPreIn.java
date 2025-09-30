package Trees;
import java.util.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data=data;
        this.left =null;
        this.right=null;
    }
}

public class ConstructionPreIn {
    private static int preOrderIndex;
    private static Map<Integer,Integer> inOrderIndexMap;

    public static TreeNode buildTree(int preorder[],int inorder[]){
        preOrderIndex=0;
        inOrderIndexMap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inOrderIndexMap.put(inorder[i],i);
        }
        // The bounds here should refer to the inorder array's indices
        return build(preorder,0,inorder.length-1);
    }

    // --- FIXED METHOD ---
    // The parameter should be `preorder` to match what's being passed.
    public static TreeNode build(int preorder[], int inOrderLeft, int inOrderRight){
        if(inOrderLeft > inOrderRight) {
            return null;
        }

        // The first element in the current preorder slice is the root
        int rootValue = preorder[preOrderIndex++];
        TreeNode root = new TreeNode(rootValue);

        // *** FIX 1: Find the root's position in the inorder array. This is the crucial step. ***
        int inOrderRootIndex = inOrderIndexMap.get(rootValue);

        // *** FIX 2: Recursively build the left and right subtrees using the correct bounds from the inorder array. ***
        // The left subtree consists of elements from the start of the current inorder slice up to the root's index.
        root.left = build(preorder, inOrderLeft, inOrderRootIndex - 1);
        // The right subtree consists of elements from after the root's index to the end of the current inorder slice.
        root.right = build(preorder, inOrderRootIndex + 1, inOrderRight);

        return root;
    }

    public static void InOrder(TreeNode root){
        if(root==null) return;
        InOrder(root.left);
        System.out.print(root.data+" ");
        InOrder(root.right);
    }

    // --- NEW METHOD TO DISPLAY THE TREE STRUCTURE ---
    public static void displayTree(TreeNode root) {
        System.out.println("Tree Structure:");
        displayTreeHelper(root, "", true);
    }

    private static void displayTreeHelper(TreeNode node, String prefix, boolean isTail) {
        if (node != null) {
            // Print the current node's value with its prefix
            System.out.println(prefix + (isTail ? "└── " : "├── ") + node.data);
            
            // Prepare the prefix for the children
            // The right child is processed first to get a more natural tree layout in the console
            List<TreeNode> children = new ArrayList<>();
            if (node.left != null) children.add(node.left);
            if (node.right != null) children.add(node.right);

            for (int i = 0; i < children.size(); i++) {
                displayTreeHelper(children.get(i), prefix + (isTail ? "    " : "│   "), i == children.size() - 1);
            }
        }
    }


    public static void main(String[] args){
        int[] preorder = {22, 12, 8, 20, 30, 25, 40};
        int[] inorder = {8 ,12 ,20, 22 ,25 ,30, 40};
        TreeNode root = buildTree(preorder, inorder);

        System.out.println("Inorder traversal of constructed tree:");
        InOrder(root);
        System.out.println("\n"); // Add a newline for better separation

        // Display the tree structure
        displayTree(root);
    }
}
