class Student {
    int rollno;
    String name;
    Student(int rollno, String name) {
        this.rollno = rollno;      
        this.name = name;
    }
    Student() {
        this(109, "Soumya Ranjan Pradhan");   
    }
    void display() {
        this.showDetails();        
        System.out.println("Roll Number: " + this.rollno);
        System.out.println("Name: " + this.name);
    }

    void showDetails() {
        System.out.println("Student Details:");
    }
    Student getStudent() {
        return this;               
    }
}

public class Ass10Q3 {
    public static void main(String args[]) {

        Student s1 = new Student(109, "Soumya Ranjan Pradhan");
        s1.display();

        Student s2 = new Student();
        s2.display();

        Student s3 = s1.getStudent();

        System.out.println("s1 and s3 are same object: " + (s1 == s3));
    }
}
