package JavaOOPs;
abstract class Shape{
  abstract void numberOfSides();
}
class Traingle extends Shape{
    @Override
     void numberOfSides(){
        System.out.println("The number of sides in a triangle 3");
    }
}
public class AbstractionDemo2 {
    public static void main(String[] args){
        Shape shape;
        shape = new Traingle();
        shape.numberOfSides();
    }
}
