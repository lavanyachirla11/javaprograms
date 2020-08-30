package pack1;
import java.util.Scanner;
public class Displaying_N_Fibonacci_terms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Number of Fibonacci terms you want : ");
		int n = sc.nextInt();
		int a=0,b=1,c=0;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(c+" ");
		}
		

	}

}
