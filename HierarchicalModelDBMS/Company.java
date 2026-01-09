package HierarchicalModelDBMS;
import java.util.*;
public class Company {
    String companyName;
    List<Department> list = new ArrayList<>();
    Company(String companyName){
        this.companyName =companyName;
    }
    void addDepartment(Department d){
        list.add(d);
    }
    void display(){
        System.out.println("Company:"+companyName);
        for(Department d:list){
            d.display();
        }
    }
}
