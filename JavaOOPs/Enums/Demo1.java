package JavaOOPs.Enums;
enum Students{
    Ram(90),Seetha(100);
    private int marks;
    Students(int marks){
        this.marks=marks;
    }
    public int getMarksOfStudents(){
        return marks;
    }
}
public class Demo1 {
    public static void main(String[] args){
        System.out.println("The total marks of the students: ");
        System.out.println("The Ram marks of subject "+Students.Ram.getMarksOfStudents()+" marks.");
        System.out.println("The Seeth marks of subject "+Students.Seetha.getMarksOfStudents()+" marks.");
    }
}
