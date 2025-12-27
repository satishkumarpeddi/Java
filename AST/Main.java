public class Main {
    public static void main(String[] args){
        ASTNode add = new BinaryOpNode(
            '+',
                new NumberNode(5),
                new NumberNode(3)
        );
        ASTNode sub = new BinaryOpNode(
            '-',
                new NumberNode(10),
                new NumberNode(4)
        );

        ASTNode mul = new BinaryOpNode('*',add, sub);
        ASTNode div = new BinaryOpNode(
            '/',
                mul,
                new NumberNode(2)
        );
        VarDeclNode ast = new VarDeclNode(div,"result");
        System.out.println("AST Representation : ");
        ast.print();
        System.out.println("Evaluated Value : ");
        System.out.println(ast.evaluate());
    }
}
