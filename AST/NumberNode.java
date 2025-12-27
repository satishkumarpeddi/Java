class NumberNode extends ASTNode{
    int value;
    public NumberNode(int value){
        this.value = value;
    }
    @Override
    void print(){
        System.out.print(value);
    }
    @Override
    int evaluate(){
        return value;
    }
}
