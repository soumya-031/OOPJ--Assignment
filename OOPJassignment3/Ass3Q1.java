 // write a program to calculate the total and percentage of five subject.
import java.util.*;
class Ass3Q1{
   public static void main(String args[]){
    double s1,s2,s3,s4,s5,total,percantage;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the subject-1 marks : ");
    s1= sc.nextDouble();
    System.out.println("Enter the subject-2 marks : ");  
    s2= sc.nextDouble();
    System.out.println("Enter the subject-3 marks : ");  
    s3= sc.nextDouble();
    System.out.println("Enter the subject-4 marks : ");  
    s4= sc.nextDouble();
    System.out.println("Enter the subject-5 marks : ");  
    s5= sc.nextDouble();
     total = s1+s2+s3+s4+s5;
     System.out.println("Total mark is : "+total);
     percantage = total/5;
 System.out.println("Percentage  is : "+percantage);

  }
}