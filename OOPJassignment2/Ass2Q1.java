//write a java program that readsan integer between 100 and 999 and add the digits in the integer
import java.lang.*;
class Ass2Q1{
 public static void main(String args[]){
    int num = 555;
    int sum = 0;
    int temp = num;
    while(temp != 0){
      sum  = sum + temp % 10;
      temp = temp / 10;
    }
     System.out.println("sum of digits :"+sum);
  }
}