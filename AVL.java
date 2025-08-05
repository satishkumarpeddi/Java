import java.util.*;
import java.util.stream.IntStream;
class AVLNODE{
    int data;
    AVLNODE left;
    AVLNODE right;
    int height;
    AVLNODE(int data){
        this.data=data;
        this.left=null;
        this.right=null;
        this.height=1;
    }
}
class AVLNODESTRUCTURE{
    AVLNODE root;
    AVLNODESTRUCTURE(){
        this.root=null;
    }
}
class Rotation{
    public static AVLNODE rightRotation(AVLNODE y){
        AVLNODE x = y.left;
        AVLNODE T2 = x.right;
        y.left=T2;
        x.right=y;
        x.height = AVL.MaxMethod(AVL.HeightOfNode(x.left), AVL.HeightOfNode(x.right))+1;
        y.height = AVL.MaxMethod(AVL.HeightOfNode(y.left), AVL.HeightOfNode(y.right))+1;
        return x;
    }
    public static AVLNODE leftRotation(AVLNODE x){
        AVLNODE y = x.right;
        AVLNODE T2 = y.left;
        y.left=x;
        x.right=T2;
        x.height = AVL.MaxMethod(AVL.HeightOfNode(x.left), AVL.HeightOfNode(x.right))+1;
        y.height = AVL.MaxMethod(AVL.HeightOfNode(y.left), AVL.HeightOfNode(y.right))+1;
        return y;
    }
}
class Insertion{
    public static AVLNODE insert(AVLNODE root,int data){
        if(root==null){
            return new AVLNODE(data);
        }
        if(data<root.data){
            root.left= insert(root.left,data);
        }else if(data>root.data){
            root.right= insert(root.right,data);
        }else{
            return root;
        }
        root.height  = AVL.MaxMethod(AVL.HeightOfNode(root.left),AVL.HeightOfNode(root.right))+1;
        int balanceFactorOfNode  = AVL.BalanceFactor(root);
        if(balanceFactorOfNode>1&&data<root.left.data)
            return Rotation.rightRotation(root);
        if(balanceFactorOfNode<-1&&data>root.right.data)
            return Rotation.leftRotation(root);
        if(balanceFactorOfNode>1&&data>root.left.data){
            root.left = Rotation.leftRotation(root.left);
            return Rotation.rightRotation(root);
        }
        if(balanceFactorOfNode<-1&&data<root.right.data){
            root.right = Rotation.rightRotation(root.right);
            return Rotation.leftRotation(root);
        }
        return root;
    }
}
class Deletion{
    public static AVLNODE deletion(AVLNODE root,int data){
        if(root==null)
            return null;
        if(data<root.data){
            root.left = deletion(root.left, data);
        }else if(data>root.data){
            root.right = deletion(root.right,data);
        }else{
            if(root.left==null||root.right==null){
                AVLNODE temp = root.left!=null?root.left:root.right;
                if(temp==null){
                    temp=root;
                    root=null;
                }else{
                   root=temp;
                }
            }else{
                AVLNODE temp = AVL.minValueNode(root.right);
                root.data=temp.data;
                root.right = deletion(root.right, data);
            }
        }
        if(root==null){
            return null;
        }
        root.height = AVL.MaxMethod(AVL.HeightOfNode(root.left), AVL.HeightOfNode(root.right))+1;
        int balanceFactorValue = AVL.BalanceFactor(root);
        if(balanceFactorValue>1&&AVL.BalanceFactor(root.left)>=0)
            return Rotation.rightRotation(root);
        if(balanceFactorValue>1&&AVL.BalanceFactor(root.left)<0){
            root.left= Rotation.leftRotation(root.left);
            return Rotation.rightRotation(root);
        }
        if(balanceFactorValue<-1&&AVL.BalanceFactor(root.right)<=0)
            return Rotation.leftRotation(root);
        if(balanceFactorValue<-1&&AVL.BalanceFactor(root.right)>0){
            root.right = Rotation.rightRotation(root.right);
            return Rotation.leftRotation(root);
        }
        return root;
    }
}
class Display{
    public static void displayMethod(AVLNODE root){
        AVLNODE temp =root;
        if(temp!=null){
            displayMethod(temp.left);
            System.out.print(temp.data+" --> ");
            displayMethod(temp.right);
        }
    }
}
public class AVL{
    public static AVLNODE minValueNode(AVLNODE root){
        AVLNODE currentNode = root;
        while(currentNode.left!=null){
            currentNode=currentNode.left;
        }
        return currentNode;
    }
    public static int  MaxMethod(int a,int b){
        return (a>b)?a:b;
    }
    public static int HeightOfNode(AVLNODE root){
        if(root==null){
            return 0;
        }
        return root.height;
    }
    public static int BalanceFactor(AVLNODE root){
        if(root==null)
            return 0;
        return HeightOfNode(root.left)-HeightOfNode(root.right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        AVLNODESTRUCTURE avlnodestructure = new AVLNODESTRUCTURE();
        System.out.print("Enter number of node in AVL tree: ");
        int nodes = sc.nextInt();
        
        IntStream.range(0,nodes).forEach(i->{
            try{
                System.out.print("Enter value for node "+(i+1)+" : ");
                int data = sc.nextInt();
               avlnodestructure.root = Insertion.insert(avlnodestructure.root, data);
            }catch(Exception error){
                throw new RuntimeException(error);
            } 
        });
        Display.displayMethod(avlnodestructure.root); 
        System.out.print("Enter a value for node to be deleted form the AVL tree: ");
        int valueForDeletedNode= sc.nextInt();
        avlnodestructure.root = Deletion.deletion(avlnodestructure.root, valueForDeletedNode);
Display.displayMethod(avlnodestructure.root); 
    }
}