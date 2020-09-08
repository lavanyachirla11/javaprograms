package pack1;
import java.util.Scanner;
public class Adam_Number {
	static int square(int n)
	{
		return (n*n);
	}
	static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int rem=n%10;
		    rev=rev*10+rem;
			n=n/10;
		}
		return (rev);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=obj.nextInt();
		int a=square(n);
		int b=square(reverse(n));
		if(a==reverse(b))
			System.out.println("It is an Adam Number");
		else
			System.out.println("It is not an Adam Number");

	}

}
