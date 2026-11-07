//write a program to enter two integers and swap them using bitwise operation.

import java.lang.*;
class Ass1Q4{
     public static void main(String args[]){
     int a = 50, b= 60;
     System.out.println("Before swap : a ="+a+",b="+b);
     a = a^b;
     b = a^b;
     a = a^b;
     System.out.println("After swap : a ="+a+",b="+b);
 }
}