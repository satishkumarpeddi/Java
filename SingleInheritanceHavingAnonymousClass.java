class Parent{
    void greet(){
        System.out.println("Hello from Parent class");
    }
}
public class SingleInheritanceHavingAnonymousClass {
    public static void main(String[] args){
        Parent obj = new Parent(){
            @Override
            void greet(){
                System.out.println("Hello from Anonymous class extending Parent");
            }
        };
        obj.greet();
    }
}
