import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int Sum=0;
      int Temp = n;
		while( Temp > 0)
		{
			int Factorial = 1; 
			int i = 1; 
		    int Reminder = Temp % 10;
		    while (i <= Reminder)
		    {
		     	Factorial = Factorial * i;
		     	i++;
		    }
		    
		     Sum = Sum + Factorial;
		     Temp = Temp /10;
		}
      if ( n == Sum )
		{
			System.out.println( "Yes");
		}
		else
		{
		   System.out.println("No");
		}
      
	}
}