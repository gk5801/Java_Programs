package placement;
import java.util.Scanner;

public class Manipulation_Of_A_Digit
{
	public static int digitx(int n)
	{
		int sum = 0;
		int product = 1 ;
		while(n>0)
		{
			product*= n%10;
			sum+= n%10;
			n = n/10;
		}
		return(product - sum);
	}
	public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   int n = sc.nextInt();
	   int g = digitx(n);
	   System.out.println(g);
	}

}
