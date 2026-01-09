package HierarchicalModelDBMS;

public class Main {
    public static void main(String[] args){
        Company company = new Company("TechAlpha's");
        Department hr = new Department("HR");
        hr.addEmployee(new Employee("Alice"));
        hr.addEmployee(new Employee("Bob"));
        Department it = new Department("IT");
        it.addEmployee(new Employee("Charlie"));
        it.addEmployee(new Employee("David"));
        company.addDepartment(hr);
        company.addDepartment(it);
        company.display();
    }
}
