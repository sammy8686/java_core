import java.io.*;
import java.lang.Math;
import java.util.Scanner;
public class task_calc
{
   public static void main(String args[])
   {
      int m1,m2;
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter two numbers: ");
	  m1=scan.nextInt();
	  m2=scan.nextInt();
	  System.out.println("Enter the operation (+,-,*,/,%)");
	  char op=scan.next().charAt(0);
	  double  b=0;
	  switch(op)
	  {
	     case '+': b=m1+m2;
		            break;
		 case '-':b=m1-m2;
		            break;
		 case '*':b=m1*m2;
		            break;
		 case '/':b=m1/m2;
		            break;
		 case '%':b=m1%m2;
		           break;
		default :
			System.out.println("SORRY! You enter wrong input");
		        break;
	}
	System.out.println("Then Final Result is: ");
	System.out.println();
	System.out.println(m1+" "+op+ " "+m2+ " = "+b);
	}
}