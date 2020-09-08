package pack1;

import java.util.Scanner;

public class Harshad_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=obj.nextInt();
		int temp=n,sum=0;
		while(temp!=0)
		{
			int rem=temp%10;
			sum+=rem;
			temp/=10;
		}
		if(n%sum==0)
			System.out.println(n +" is a Harshad number ");
		else
			System.out.println(n +" is not a Harshad number ");
					
	}

}
