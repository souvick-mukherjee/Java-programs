package souvick;
class Student{
    String name;
    int roll;
    int marks;
    void displayResult(){
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Marks: " + marks);
        if(marks > 40)
            System.out.println("Passed");
        else
            System.out.println("Failed");
    }
}
public class StudentReport {
    public static void main(String[] args) {
        Student s1 = new Student(); //create a Student object called s1
        s1.name = "Sagnik";
        s1.roll = 30;
        s1.marks = 85;
        s1.displayResult();
    }
}
