abstract class One{
    abstract void OverrideIt();
    void check(){
        System.out.println("Concrete method form abstract class.");
    }
}
public class Abstraction {
    public static void main(String[] args){
        One exOne = new One(){
            @Override
            void OverrideIt(){
                System.out.println("abstraction from anonymous class");
            }
        };
        exOne.check();
        exOne.OverrideIt();
    }
}
