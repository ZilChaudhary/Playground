import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code here
    Scanner in = new Scanner(System.in);
	int n = in.nextInt();
	int i;
	int m =3;
	for (i=1; i<=n; i++)
	{
	    System.out.print(i);
	    if ((i%m == 0) )
	    {
	        System.out.print(",");
	    }
	    else 
	    continue;
	}
  }
}