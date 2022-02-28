import java.util.Scanner;
class task_fact
{
  public static void main(String args[])
  {
     long n,i,fact=1;
	 System.out.println("Enter Any Number:");
	 Scanner scan = new Scanner(System.in);
	 n=scan.nextLong();
	 for(i=1;i<=n;i++)
	 {
	    fact=fact*i;
	 }
	  System.out.println("\n Factorial of given number is: "+fact);
	 }
}