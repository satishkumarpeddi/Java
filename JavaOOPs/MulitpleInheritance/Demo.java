package JavaOOPs.MulitpleInheritance;
interface A{
    default void show(){
        System.out.println("A");
    }
}
interface B{
    default void show(){
        System.out.println("B");
    }
}
class C implements A,B{
    // @Override
    public void show(){
        System.out.println("C choose to call A:");
        A.super.show();
        System.out.println("C choose to call B:");
        B.super.show();
    }
}
public class Demo {
    public static void main(String[] args){
        C obj = new C();
        obj.show();
    }
}
