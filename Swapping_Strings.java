package stringprgms;

import java.util.Scanner;

public class Swapping_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two strings : ");
		String a = sc.next();
		String b = sc.next();
		System.out.println("Before Swapping a = "+a+" b = "+b);
		String c=a+b;
		b=c.substring(0,a.length());
		a=c.substring(b.length());
		System.out.println("After Swapping a = "+a+" b = "+b);
		
	}

}
