package pack1;

import java.util.Scanner;

public class Sum_of_fibonacci_upto_given_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term upto which you want Fibonacci series sum : ");
		int n=sc.nextInt();
		int a=0,b=1,c,sum=a+b;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			sum=sum+c;
			a=b;
			b=c;
		}
		System.out.println("The sum u required is "+sum);
	}

}
