import java.util.*;
class Ass3Q4
{
 public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   double n;
  System.out.println("Enter a number");
  n = sc.nextDouble();
if(n<0)
     System.out.println("This  is negative number");
else if (n ==0)
     System.out.println("This  is Zero");
else
    System.out.println("This is positive number");
 }
}