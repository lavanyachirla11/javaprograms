package pack1;

import java.util.Scanner;

public class Count_of_No_of_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");
		int count=0;
		String s =sc.next();
		String temp=1+s;
		int nt=Integer.parseInt(temp);
		while(nt!=0)
		{
			nt=nt/10;
			count++;
		}
		System.out.println("There are "+(count-1)+" digits in given number");

	}

}
