package ComplexObjectSerialization;
import java.io.*;
import java.util.*;
class Address implements Serializable{
    private static final long serialVersionUID = 1001L;
    private String city;
    private String state;
    private int pinCode;
    Address(String city,String state,int pinCode){
        this.city=city;
        this.state=state;
        this.pinCode=pinCode;
    }
    @Override
    public String toString(){
        return city+" , "+state+" , "+pinCode+".";
    }
}
class Person implements Serializable{
    private static final long serialVersionUID = 2001L;
    protected String name;
    protected Address address;
    protected int age;
    public Person(String name,Address address,int age){
        this.name=name;
        this.age=age;
        this.address=address;
    }

}
class Student extends Person{
    private static final long serialVersionUID = 3001L;
    private String course;
    private double marks;
    private transient String secretNote;
    public Student(String name,int age,Address address,String course,double marks,String secretNote){
        super(name,address,age);
        this.course=course;
        this.marks=marks;
        this.secretNote=secretNote;
    }
    private void writeObject(ObjectOutputStream oss)throws IOException{
        oss.defaultWriteObject();
        oss.writeUTF("MASKED");
    }
    private void readObject(ObjectInputStream ois)throws IOException,ClassNotFoundException{
        ois.defaultReadObject();
        this.secretNote = ois.readUTF();
    }
    @Override
    public String toString(){
        return "\nName: " + name +
               "\nAge: " + age +
               "\nCourse: " + course +
               "\nMarks: " + marks +
               "\nSecret Note: " + secretNote +
               "\nAddress: " + address;
    }
}

public class Demo {
    public static void main(String[] args){
        Address a1 = new Address("Hyderabad","Telangana",500072);
        Student s1 = new Student("Satish Kumar Peddi ", 19, a1, "Java", 91.5, "Top Performance!");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream("sample.txt"))){
           
            oss.writeObject(studentList);
            System.out.println("Complex Object Serialized Successfully!");
        }catch(Exception e){
            e.printStackTrace();
        }
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("sample.txt"))){
            ArrayList<Student> list = (ArrayList<Student>) ois.readObject();
            System.out.println("Complex Object Deserialized Successfully!");
            for(Student s:list){
                System.out.println(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
