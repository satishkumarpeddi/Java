
abstract class Vehicle{
    abstract void start();
    abstract void stop();
    void fuel(){
        System.out.println("Fueling up");
    }
}
abstract class Car extends Vehicle{
    @Override
    void start(){
        System.out.println("Car started");
    }
}
class Sedan extends Car{
    @Override
    void stop(){
        System.out.println("Car stopped");
    }
}
public class SampleAbstraction {
    public static void main(String[] args){
        Vehicle myCar = new Sedan();
        myCar.start();
        myCar.fuel();
        myCar.stop();
    }
}
