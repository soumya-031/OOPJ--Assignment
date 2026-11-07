class Circle {

    double radius;

    Circle(double r) {
        radius = r;
    }

    void area() {
        double a = 3.14 * radius * radius;
        System.out.println("Area: " + a);
    }

    void circumference() {
        double c = 2 * 3.14 * radius;
        System.out.println("Circumference: " + c);
    }

    public static void main(String[] args) {

        Circle c = new Circle(3.0);

        c.area();
        c.circumference();
    }
}

