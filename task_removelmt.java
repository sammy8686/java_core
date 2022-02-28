import java.util.Scanner;
public class task_removelmt
{
  public static void main(String args[])
  {
    Scanner scan=new Scanner(System.in);
	int[] intarr={1,3,4,56,78,9,6};
	System.out.println("Enter elements to be detected: ");
	int enm=scan.nextInt();
	for(int i=0;i<intarr.length;i++)
	{
	  if(intarr[i]==enm)
	  {
	    for(int j=i;j<intarr.length-1;j++)
		{
		  intarr[j]=intarr[j+1];
		 }
		 break;
	  }
	}
	System.out.println("Elements----");
	for(int i=0;i<intarr.length;i++)
	{
	  System.out.println("  "+intarr[i]);
	  
	 }
}
}