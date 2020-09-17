package pack1;
import java.util.Scanner;
public class Zukarman_Number {
	static int display(int n) 
	{
		int p = 1;
		while( n != 0)
		{
			int rem = n%10; 
			p = p* rem; 
			n = n/10; 
		} 
		return p; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt(); 
		
		if(n % display(n) == 0) 
			System.out.println(n+" is a Zukarman Number");
		else
			System.out.println(n+" is not a Zukarman Number");

	}

}
