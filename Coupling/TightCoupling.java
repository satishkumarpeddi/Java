package Coupling;
class Engine1{
    void start(){
        System.out.println("Engine Started.");
    }
}

public class TightCoupling {
    public static void main(String[] args){
        Engine1 engine = new Engine1();
        engine.start();
    }
}
