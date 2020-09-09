package pack1;
import java.util.Scanner;
public class Neon_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=obj.nextInt();
		int square,sum=0;
		square=n*n;
		while(square!=0)
		{
			int rem =square%10;
			sum=sum+rem;
			square/=10;
		}
		if(sum==n)
			System.out.println(n+" is a neon number");
		else
			System.out.println(n+" is not a neon number");
		

	}

}
