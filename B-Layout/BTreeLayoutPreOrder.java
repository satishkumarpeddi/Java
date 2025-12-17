import java.util.ArrayList;
import java.util.List;
class TreeNode{
    int value;
    TreeNode  left;
    TreeNode right;
    TreeNode(int value){
        this.value=value;
    }
}
class LayoutNode{
    TreeNode node;
    int x;
    int y;
    LayoutNode(TreeNode node,int x,int y){
        this.node=node;
        this.x=x;
        this.y=y;
    }
}
public class BTreeLayoutPreOrder {
    private static int x;
    public static List<LayoutNode> layoutTree(TreeNode root){
        List<LayoutNode> nodes = new ArrayList<>();
        x=0;
        dfs(root,0,nodes);
        return nodes;
    }
    //preorder
    private static void dfs(TreeNode node,int depth,List<LayoutNode> nodes){
        if(node==null) return;
        nodes.add(new LayoutNode(node, x++, depth));
        dfs(node.left,depth+1,nodes);
        dfs(node.right,depth+1,nodes);
    }
    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(7);

        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(20);

        List<LayoutNode> layout = layoutTree(root);
        System.out.println("Node\tX\tY");
        System.out.println("-------------------");
        for (LayoutNode ln : layout) {
            System.out.println(
                ln.node.value + "\t" + ln.x + "\t" + ln.y
            );
        }
    }
}
