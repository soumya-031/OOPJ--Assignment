import java.util.Scanner;

class Employee {

    String name;
    String job;
    double salary;

    Employee(String name, String job, double salary) {
        this.name = name;
        this.job = job;
        this.salary = salary;
    }

    double calculateSalary(int days) {
        return (salary / 30) * days;
    }

    void updateSalary(int days) {
        salary = (salary / 30) * days;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter job: ");
        String job = sc.nextLine();

        System.out.print("Enter monthly salary: ");
        double salary = sc.nextDouble();

        Employee e = new Employee(name, job, salary);

        System.out.print("How many days did the employee work? ");
        int days = sc.nextInt();

        System.out.println("\nEmployee Details");
        System.out.println("Name: " + e.name);
        System.out.println("Job: " + e.job);
        System.out.println("Monthly Salary: " + e.salary);

        System.out.println("Salary for " + days + " days: "
                + e.calculateSalary(days));

        e.updateSalary(days);

        System.out.println("Updated Salary: " + e.salary);

        sc.close();
    }
}