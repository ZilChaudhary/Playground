import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum1 = sum_of_num(n);
      System.out.println(sum1);
	}
  public static int sum_of_num(int a){
    int sum=0;
    for(int i =1; i<=a; i++){
    	sum=sum+i;
    }
    return sum;
  }
}