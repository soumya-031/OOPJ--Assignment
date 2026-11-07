import java.util.*;
class Ass4Q1
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a");
		double a = sc.nextDouble();
		System.out.println("Enter b");
		double b = sc.nextDouble();
		System.out.println("Enter c");
		double c = sc.nextDouble();
	if(a == 0){
	     System.out.println("It is not a quadratic equation");
          }
	else{
                double D = (b*b)-(4*a*c);
		if(D>0){
                            double r1 = (-b + Math.sqrt(D))/(2*a);
			    double r2 = (-b + Math.sqrt(D))/(2*a);
			    System.out.println("in the equation have real and district roots");
			    System.out.println("1st Root = "+r1);
			    System.out.println("2nd Root = "+r2);
			} else if(D == 0){
 					   double r = -b/(2*a);
					   System.out.println("in equation have real and equal roots");
					 }
                        else{ 
                                double relap = -b/(2*a);
				double imgpart = Math.sqrt(-D)/(2*a);
				System.out.println("the in-equation have complex roots : ");
				System.out.println("1st root  = "+relap + "+"+imgpart +" : ");
				System.out.println("2nd root  = "+relap + "-"+imgpart +" : ");

                             }
		}
        }
}