import java.util.*;
class sh_pallindrome
{
  public static void main(String args[])
  {
  int a,n,rem,rev=0;
  System.out.println("\n enter any number");
  Scanner scan=new Scanner(System.in);
  n=scan.nextInt();
  a=n;
   while(n>0)
   {
   rem=n%10;
   rev=rev*10+rem;
   n=n/10;
   }
   System.out.println("\n reverse number="+rev);
    if(a==rev)
    {  
    System.out.println("\n number is pallindrom number");
    }
     else
     {
     System.out.println("\n number is not pallindrom");
     }
  } 
}