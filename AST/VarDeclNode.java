class VarDeclNode extends ASTNode {
    ASTNode expression;
    String varName;
    public VarDeclNode(ASTNode expression,String varName){
        this.expression =expression;
        this.varName = varName;
    }
    @Override
    void print(){
        System.out.print("int "+varName+" = ");
        expression.print();
        System.out.println(";");
    }
    @Override
    int evaluate(){
        return expression.evaluate();
    }
}
