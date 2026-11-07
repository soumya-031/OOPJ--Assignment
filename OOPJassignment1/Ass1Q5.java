// write a program to enter three sides of a triangle and print the area of the triangle.
import java.lang.*;
class Ass1Q5{
  public static void main(String args[]){
    double a = 3.0, b  = 4.0, c = 5.0;
    double s = (a+b+c)/2.0;
    double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Area of a triangle : "+area);
  }
}

