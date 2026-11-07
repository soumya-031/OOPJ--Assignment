import java.util.Scanner;

class Student {

    String name;
    int rollno;
    String course;

    void selectCourse(Scanner sc) {

        System.out.println("Select a course:");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C++");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            course = "Java";
        } else if (choice == 2) {
            course = "Python";
        } else if (choice == 3) {
            course = "C++";
        } else {
            course = "Invalid Course";
        }
    }

    void display() {
        System.out.println("\nStudent Details");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollno);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student s = new Student();

        System.out.print("Enter student name: ");
        s.name = sc.nextLine();

        System.out.print("Enter roll number: ");
        s.rollno = sc.nextInt();

        s.selectCourse(sc);

        s.display();

        sc.close();
    }
}