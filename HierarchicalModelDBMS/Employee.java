package HierarchicalModelDBMS;

public class Employee {
    String name;
    Employee(String name){
        this.name=name;
    }
    void display(){
        System.out.println("        Employee:"+name);
    }
}
