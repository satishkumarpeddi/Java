package Trees;
import java.util.*;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val){
        this.val=val;
        this.left=null;
        this.right=null;
    }
}
public class subtreeWithAllDeepest {
    static Map<TreeNode,Integer> depth;
    static int max_depth=0;
    public static TreeNode answer(TreeNode root){
        if(root==null||depth.get(root)==max_depth) return root;
        TreeNode L = answer(root.left);
        TreeNode R = answer(root.right);
        if(L!=null && R!=null) return root;
        if(L!=null) return L;
        if(R!=null) return R;
        return null;

    }
    public static void dfs(TreeNode node,TreeNode parent){
        if(node!=null){
            depth.put(node,depth.get(parent)+1);
            dfs(node.left,node);
            dfs(node.right,node);
        }
    }
    public static TreeNode subtreeWithAllDeepestHelpMethod(TreeNode root){
        depth = new HashMap<>();
        depth.put(null,-1);
        dfs(root,null);
        max_depth = -1;
        for(Integer d : depth.values())
            max_depth = Math.max(max_depth,d);
        return answer(root);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);
        TreeNode result = subtreeWithAllDeepestHelpMethod(root);
        System.out.println(result.val);
    }
}
