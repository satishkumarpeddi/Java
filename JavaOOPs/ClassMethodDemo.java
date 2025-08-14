package JavaOOPs;
import java.lang.reflect.Field;
 class Student{
    private String id;
    private String name;
    private int age;
    private int phone;
}
public class ClassMethodDemo {
    public static void main(String[] args){
        Class<?> clazz = Student.class;
        Field[] fields =  clazz.getDeclaredFields();
        for(Field field: fields){
            if(field.getModifiers()==java.lang.reflect.Modifier.PRIVATE)
                System.out.println("Private variable found: "+field.getName());
        }
    }
}
