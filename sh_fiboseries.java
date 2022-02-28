import java.util.*;
class sh_fiboseries
{
  public static void main(String args[])
  {
  int F=1,S=1,t,i,range;
  System.out.println("\n enter any range");
  Scanner scan=new Scanner(System.in);
  range=scan.nextInt();
  System.out.println("\n fibonancies series");
  System.out.println("  \n  " +F);
  System.out.println("  \n  " +S);
   for(i=1;i<=range;i++) 
   {
   t=F+S;
   System.out.println("\n"+t);
   F=S;
   S=t;
   }
  }
} 
