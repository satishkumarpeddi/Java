public class wrapperClass {
    public static void main(String[] args){
        int primitiveDataInt = 9;
        Integer primitiveInteger = primitiveDataInt;
        System.out.println("Autoboxing (i.e primitive to object(Wrapper class)) ");
        System.out.println("The PrimitiveDataInt : "+primitiveDataInt);
        System.out.println("The PrimitiveInteger : "+primitiveInteger);
        Double primitiveDouble = 3432.23;
        double primitiveDataDouble = primitiveDouble;
        System.out.println("Unboxing (i.e object(wrapper class) to primitive)");
        System.out.println("The PrimitiveDataDouble : "+primitiveDataDouble);
        System.out.println("The PrimitiveDouble : "+primitiveDouble);
    }
    
}
