package pack1;
import java.util.*;
public class Abundant_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt(); 
		if(display(n) > n) 
			System.out.println(n+" is a Abundant Number");
		else
			System.out.println(n+" is not a Abundant Number");
		}
		
		static int display(int n) 
		{
			int sum =0;
			for(int i=1; i<= (Math.sqrt(n));i++) 
			{
				if(n%i==0) 
				{
					sum = sum + i + (n/i); 
				}
			}
			sum = sum-12; 
			return sum;

	}

}
