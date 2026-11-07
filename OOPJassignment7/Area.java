
import java.util.Scanner;

class Area {

    static void rectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle = " + area);
    }

    void squareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square = " + area);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        rectangleArea(length, breadth);

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        Area obj = new Area();

        obj.squareArea(side);

        sc.close();
    }
}
