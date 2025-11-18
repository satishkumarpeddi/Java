package ComplexObjectSerializationUsingConcurreny;
import java.io.*;
import java.util.*;
import java.util.concurrent.*;
class Address implements Serializable{
    private static final long serialVersionUID = 1001L;
    private String city;
    private String state;
    private int pinCode;
    public Address(String city,String state,int pinCode){
        this.city=city;
        this.state=state;
        this.pinCode=pinCode;
    }
    @Override
    public String toString(){
        return city+" "+state+" "+pinCode;
    }
}
class Person implements Serializable{
    private static final long serialVersionUID = 2001L;
    protected String name;
    protected int age;
    protected Address address;
    public Person(String name,int age,Address address){
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
        super(name,age,address);
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
        this.secretNote =  ois.readUTF();
    }
    @Override
    public String toString(){
        return ("Name: "+name+"\nAge: "+age+"\nAddress: "+address+"\nCourse: "+course+"\nMarks: "+marks+"\nsecretNote: "+secretNote);
    }
}
public class Demo {
    private static final Object FILE_LOCK = new Object();
    private static final String FILE_NAME = "student.exe";
    
    public static void main(String[] args)throws InterruptedException{
        ExecutorService exectuor = Executors.newFixedThreadPool(3);
        List<Student> studentBatch = Collections.synchronizedList(new ArrayList<>());
        for(int i=1;i<=5;i++){
            final int id = i;
           exectuor.submit(()->{
             Address address = new Address("City-"+id,"State-"+id,500000+id);
            Student student = new Student("Student-" + id,
                        18 + id,
                        address,
                        "Course-" + id,
                        90 + id,
                        "Thread Note " + id);
          studentBatch.add(student);
          synchronized(FILE_LOCK){
            try(ObjectOutputStream oss = new ObjectOutputStream(new FileOutputStream(FILE_NAME))){
                oss.writeObject(student);
                System.out.println(Thread.currentThread().getName()+" serialized: "+student.name);
            }catch(Exception e){
                e.printStackTrace();
            }
          }
            });
        }
        exectuor.shutdown();
        exectuor.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("\n All student objects serialized successfully.");
        System.out.println("\nReading Objects from file....");
                try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))){
                    Student student = (Student)ois.readObject();
                    System.out.println("\nDeserialized object:");
                    System.out.print(student);
                }catch(Exception e){
                   e.printStackTrace();
                }
            
        
    }
}
