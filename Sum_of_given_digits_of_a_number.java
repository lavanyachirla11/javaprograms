package pack1;

import java.util.Scanner;

public class Sum_of_given_digits_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int rem,sum=0;
		while(n!=0)
		{
			rem=n%10;
			sum=rem+sum;
			n=n/10;
			
		}
		
		System.out.println("The sum of digits of given number is "+sum);

	}

}
