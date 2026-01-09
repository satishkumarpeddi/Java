package HierarchicalModelDBMS;
import java.util.*;
public class Department {
    String departmentName;
    List<Employee> list = new ArrayList<>();
    Department(String departmentName){
        this.departmentName=departmentName;
    }
    void addEmployee(Employee e){
        list.add(e);
    }
    void display(){
        System.out.println("        Department:"+departmentName);
        for(Employee e:list){
            e.display();
        }
    }
}
