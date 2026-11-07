class Rectangle {
    double width;
    double height;

    
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    
    double calculateArea() {
        return width * height;
    }

    
    double calculatePerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        
        Rectangle rectangle = new Rectangle(10, 5);

        
        System.out.println("Area of Rectangle = " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle = " + rectangle.calculatePerimeter());
    }
}