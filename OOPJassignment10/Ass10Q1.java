class Bank {
    double roi; 

    void getroi() {
        System.out.println("Display the rate of interest");
    }
}

class Sbi extends Bank {
    void getroi() {
        System.out.println("Rate of Interest SBI: " + roi);
    }
}

class Icici extends Bank {
    
    void getroi() {
        System.out.println("Rate of Interest ICICI: " + roi);
    }
}

class Axis extends Bank { 
    void getroi() {
        System.out.println("Rate of Interest AXIS: " + roi);
    }
}

public class Ass10Q1 {
    public static void main(String args[]) {
        
        Sbi s = new Sbi();
        s.roi = 6.5; 
        s.getroi();

        
        Icici i = new Icici();
        i.roi = 7.3;
        i.getroi();

        
        Axis a = new Axis();
        a.roi = 9.7;
        a.getroi();
    }
}