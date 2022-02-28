import java.util.*;
class strg_pallindrom
{
 public static void main(String args[])
 {
 int i;
 String s1;
 String s2="";
 System.out.println("enter any string");
 Scanner scan=new Scanner(System.in);
 s1=scan.next();
 System.out.println("string length="+s1.length());
  for(i=s1.length()-1;i>=0;i++)
  {
  s2=s2+s1.charAt(i);
  }
  System.out.println("\n string reverse="+s2);
    if(s1.equals(s2))
      System.out.println("this string is pallindrom");
    else
      System.out.println("this string is not pallindrom");
 }
}