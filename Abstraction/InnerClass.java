abstract class Outer{
    abstract void display();
    class Inner{
        void show(){
            System.out.println("Innner class inside abstract class.");
        }
    }
}
class Child extends Outer{
    @Override
    void display(){
        System.out.println("Child implementation of abstract method.");
    }
}
public class InnerClass {
    public static void main(String[] args){
        Child child = new Child();
        child.display();
        Outer.Inner inner = child.new Inner();
        inner.show();
    }
}
