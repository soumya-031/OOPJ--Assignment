//write a java program gross salary using salary, HAR(10% of basic) and DA(60% of basic).
import java.util.*;
class Ass3Q2
{
   public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   double GS,basic,HAR,DA;
   System.out.println("Enter the basic salary");
  basic = sc.nextDouble();
  HAR = basic * 0.1;
  DA = basic * 0.6;
  GS = basic+DA+HAR;
  System.out.println("Gross salary calculated : rs"+GS);
  }
}
