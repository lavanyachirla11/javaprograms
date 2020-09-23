package pack1;
import java.util.*;
public class Duffinian_number {
	static int sum_div(int n)
	{
		int div=0;
		for(int i=1; i<=Math.sqrt(n); i++)
		{
			if(n%i==0)
				div = div + i + n/i;
		}
		return div;
	}
	static int gcd(int n1, int n2)
	{
		int gcd=1;
		for(int i=1 ;i<=((n1<n2)?n1:n2);i++)
		{
			if(n1%i==0 && n2%i==0 )
			{
				gcd=i;
			}
		}
		return gcd;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n1 = sc.nextInt();
		int n2 = sum_div(n1);
		int gcd = gcd(n1,n2);
		if(gcd==1)
			System.out.println(n1+" is a Duffinian number");
		else
			System.out.println(n1+" is not a Duffinian number");		
	}

}
