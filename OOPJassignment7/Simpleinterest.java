import java.util.Scanner;

class SimpleInterest {

    static void calculateSI(double principal, double time) {
        double rate = 5.0;
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    static void calculateSI(double rate, int time) {
        double principal = 10000;
        double si = (principal * rate * time) / 100;

        System.out.println("Simple Interest = " + si);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter Time: ");
        double time = sc.nextDouble();

        calculateSI(principal, time);

        System.out.print("Enter Rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter Time: ");
        int t = sc.nextInt();

        calculateSI(rate, t);

        sc.close();
    }
}