package Coupling;
interface Engine{
    void start();
}
class PetrolEngine implements Engine{
    public void start(){
        System.out.println("Petrol Engine Started.");
    }
}
class Car{
    private Engine engine;
    Car(Engine engine){
        this.engine=engine;
    }
    public void startCar(){
        engine.start();
    }
}
public class LoosCoupling {
    
    public static void main(String[] args){
        Car car = new Car(new PetrolEngine());
        car.startCar();
    }
}
