import java.util.*;
class Ass4Q2
{
  public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("input 1st floating number : ");
   double n1 = sc.nextDouble();
   System.out.println("input 2nd floating number : ");
   double n2 = sc.nextDouble(); 
   if(Math.round(n1*1000) == Math.round(n2*1000)){
     System.out.println("They are same upto 3 decimal places");
  }else{
	System.out.println("They are different");
       }
   sc.close();
 } 
} 