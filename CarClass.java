import java.util.Scanner;
class Car{
    int noOfGear;
    String color;
    Car(int noOfGear,String color){
        this.noOfGear=noOfGear;
        this.color=color;
    }
    void printCarInfo(){
        System.out.println("noOfGear: "+noOfGear);
        System.out.println("color: "+color);
    }

}
class RaceCar extends Car{
    int maxSpeed;
    RaceCar(int noOfGear,String color,int maxSpeed){
        super(noOfGear, color);
        this.maxSpeed=maxSpeed;
    }
    void printCarInfo(){
        super.printCarInfo();
        System.out.println("maxSpeed: "+maxSpeed);
    }
}
public class CarClass {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no of gear: ");
        int noOfGear = sc.nextInt();
        System.out.println("Enter color of the car: ");
        sc.nextLine();
        String carColor = sc.nextLine();
        System.out.println("Enter Max Speed of the car: ");
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, carColor, maxSpeed);
        raceCar.printCarInfo();
    }
}
