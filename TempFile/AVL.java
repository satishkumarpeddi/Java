package TempFile;
import java.util.*;
import java.util.stream.IntStream;
// import javax.management.RuntimeErrorException;
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
class AVLNODEStrcture{
    AVLNODE root;
    AVLNODEStrcture(){
        this.root=null;
    }
}
class Rotation{
    public static AVLNODE leftRotation(AVLNODE y){
        AVLNODE x = y.right;
        AVLNODE T2 = x.left;
        x.left = y;
        y.right=T2;
        y.height = AVL.maxValueMethod(AVL.heightOfNode(y.left), AVL.heightOfNode(y.right))+1;
        x.height = AVL.maxValueMethod(AVL.heightOfNode(x.left), AVL.heightOfNode(x.right))+1;
        return x;
    }
    public static AVLNODE rightRotation(AVLNODE x){
        AVLNODE y = x.left;
        AVLNODE T2 = y.right;
        x.left = T2;
        y.right= x;
        y.height = AVL.maxValueMethod(AVL.heightOfNode(y.left), AVL.heightOfNode(x.right))+1;
        x.height = AVL.maxValueMethod(AVL.heightOfNode(x.left), AVL.heightOfNode(x.right))+1;
        return y;
    }
}
class Insertion{
    public static AVLNODE insert(AVLNODE root,int data){
        if(root==null)
            return new AVLNODE(data);
        if(data<root.data)
            root.left = insert(root.left, data);
        else if(data>root.data)
            root.right = insert(root.right,data);
        else
            return root;
        root.height = AVL.maxValueMethod(AVL.heightOfNode(root.left), AVL.heightOfNode(root.right))+1;
        int balanceFactor = AVL.balanceFactor(root);
        if(balanceFactor>1&&data<root.left.data)
            return Rotation.rightRotation(root);
        if(balanceFactor<-1&&data>root.right.data)
            return Rotation.leftRotation(root);
        if(balanceFactor>1&&data>root.left.data){
            root.left = Rotation.leftRotation(root.left);
            return Rotation.rightRotation(root);
        }
        if(balanceFactor<-1&&data<root.right.data){
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
        if(data<root.data)
            root.left = deletion(root.left, data);
        else if(data>root.data)
            root.right = deletion(root.right, data);
        else{
            if((root.left)==null||(root.right)==null){
                AVLNODE temp = (root.left!=null)?root.left:root.right;
                if(temp==null){
                    temp=root;
                    root=null;
                }else{
                    root=temp;
                }
            }else{
                AVLNODE temp = AVL.minValueNode(root.right);
                root.data=temp.data;
                root.right = deletion(root.right, temp.data);
            }
        }
        if(root==null) return null;
        root.height = AVL.maxValueMethod(AVL.heightOfNode(root.left), AVL.heightOfNode(root.right))+1;
        int balanceFactor = AVL.balanceFactor(root);
        if(balanceFactor>1&&AVL.balanceFactor(root.left)<=0)
            return Rotation.leftRotation(root);
        if(balanceFactor>1&&AVL.balanceFactor(root.left)>0){
            root.left = Rotation.leftRotation(root.left);
            return Rotation.rightRotation(root);
        }
        if(balanceFactor<-1&&AVL.balanceFactor(root.right)>=0)
            return Rotation.rightRotation(root);
        if(balanceFactor<-1&&AVL.balanceFactor(root.right)<0){
            root.right = Rotation.rightRotation(root.right);
            return Rotation.leftRotation(root);
        }
        return root;
        }
    }

public class AVL {
    public static AVLNODE minValueNode(AVLNODE root){
        AVLNODE currentNode  = root;
        while(currentNode.left!=null){
            currentNode = currentNode.left;
        }
        return currentNode;
    }
    public static int maxValueMethod(int a,int b){
        return (a>b)?a:b;
    }
    public static int heightOfNode(AVLNODE root){
        if(root==null)
            return 0;
        return root.height;
    }
    public static int balanceFactor(AVLNODE root){
        if(root==null)
            return 0;
        return heightOfNode(root.left)-heightOfNode(root.right);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of nodes in AVL Tree: ");
        int nodes = sc.nextInt();
        IntStream.range(0,nodes).forEach(i->{
            try{
                System.out.println("Enter a value for node "+(i+1)+" : ");
                int data = sc.nextInt();

            }catch(Exception error){
                throw new RuntimeException(error);
            }
        });
    }
}
