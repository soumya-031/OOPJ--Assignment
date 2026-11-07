// write a program to calculate profit or loss percentage
import java.util.*;
class Ass3Q5
{
  public static void main(String args[]){
Scanner sc = new Scanner(System.in);
double buy,sell,diff,lp,pp;
System.out.println("Enter the buying price");
buy = sc.nextDouble();
System.out.println("Enter the selling price");
sell = sc.nextDouble();
if(buy == sell)
  System.out.println("No Proft/Loss");
else if(buy > sell){
  diff = buy - sell;
  lp = (diff*100)/buy;
  System.out.println("loss percentage is :"+lp+"%");
  }
else{
 diff = sell-buy;
 pp = (diff*100)/buy;
 System.out.println("profit percentage is : "+pp+"%");
   }
  }
}