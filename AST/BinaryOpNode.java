public class BinaryOpNode extends ASTNode{
    char operator;
    ASTNode left;
    ASTNode right;
    public BinaryOpNode(char operator,ASTNode left,ASTNode right){
        this.operator =operator;
        this.left=left;
        this.right=right;
    }
    @Override
    void print(){
        System.out.print("( ");
        left.print();
        System.out.print("("+operator+")");
        right.print();
        System.out.print(" )");
    }
    @Override
    int evaluate(){
        int l = left.evaluate();
        int r = right.evaluate();
        switch (operator) {
            case '+': return l+r;
            case '-': return l-r;
            case '*': return l*r;
            case '/': return l/r;
            case '%': return l%r;
            default: return 0;
        }
    }
    public static void main(String[] args){

    }
}
