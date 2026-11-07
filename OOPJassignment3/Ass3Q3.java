//write a java program to calculate electricity cost[0-100 : 3rs, 100-500 : 4rs, >500 : 6rs]
import java.util.*;
class Ass3Q3
{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  double e, cost=0;
  System.out.println("Enter  electricity comsumption");
  e = sc.nextDouble();
  if(e<=100) 
     cost = 3*e;
  else if(e<= 500)
     cost = (100*3)+(e-100)*4;
  else
     cost = (100*3)+(400*4)+(e-500)*6;
System.out.println("total cost of electricity is : Rs"+cost);

 } 
}
