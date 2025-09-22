abstract class Outer{
    abstract void display();
    static class StaticInner{
        void display(){
            System.out.println("Static Inner class inside abstract class");
        }
    }
}
class Child extends Outer{
    @Override
    void display(){
        System.out.println("Child implementation of abstract method");
    }
}
public class StaticInnerClass {
    public static void main(String[] args){
        Child child = new Child();
        child.display();
        Outer.StaticInner innerClass = new Outer.StaticInner();
        innerClass.display();
    }
}
