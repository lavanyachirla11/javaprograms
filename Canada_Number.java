package pack1;
import java.util.*;
public class Canada_Number {
	static int sum_square(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			int rem = n % 10;
			sum = sum + rem*rem;
			n /= 10;
		}
		return sum;
	}
	static int sum_div(int n)
	{
		int div =0;
		for(int i=1; i<= Math.sqrt(n);i++) 
		{
			if(n%i==0) 
				div = div + i + n/i ; 	
		}
	
	return (div - 1 - n); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		if(sum_square(n) == sum_div(n))
			System.out.println(n+" is a Canada number");
		else
			System.out.println(n+" is not a Canada number");

	}
}
