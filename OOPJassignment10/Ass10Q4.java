class Student {
    static String collegeName = "GIETU";
    
    int rollNo;
    String name;
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }
    static {
        System.out.println("College Name : " + collegeName);
    }
    static void changeCollege(String newCollege) {
        collegeName = newCollege;
    }
    void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("College: " + collegeName);
        System.out.println();
    }
}

public class Ass10Q4 {
    public static void main(String[] args) {
        Student s = new Student(109, "Soumya");
        s.show();
        Student.changeCollege("GIETU Advanced");
        Student s1 = new Student(99, "Piyush");
        s1.show();
    }
}