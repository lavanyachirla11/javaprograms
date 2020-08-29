package pack1;
import java.util.Scanner;
public class Nth_Fibonacci_term {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the term which you want in Fibonacci series : ");
		int n=sc.nextInt();
		int a=0,b=1,c=0,sum=a+b;
		for(int i=2;i<=n;i++)
		{
			c=a+b;
			sum=sum+c;
			a=b;
			b=c;
		}
		System.out.println("The term u required is "+c);
	}
		

	}

