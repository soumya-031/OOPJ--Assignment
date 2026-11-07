class Employee {
    
    String name;
    double salary;
    int hiredate; 

    
    int yearofservice(int currentyear) {
        int serviceYears = currentyear - hiredate;
        return serviceYears;
    }

    
    void display(int currentyear) {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Years of service: " + yearofservice(currentyear));
    }

    
    public static void main(String[] args) {
        Employee e = new Employee();
        
        
        e.name = "Soumya";
        e.salary = 60000.0;
        e.hiredate = 2017;

        
        e.display(2026);
    }
}