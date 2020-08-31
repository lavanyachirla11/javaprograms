package pack1;
import java.util.*;
public class Reverse_First_Last_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int fdigit, ldigit, digits, rev_num;
		digits  = (int)Math.log10(n);
		ldigit  = n%10;
		fdigit = (int)(n/Math.pow(10,digits)); 
		rev_num = ldigit * (int)(Math.pow(10, digits)); 
		
		rev_num = rev_num + n %(int)(Math.pow(10,digits));
		
		rev_num = rev_num - ldigit; 
		
		rev_num = rev_num + fdigit; 
		
		System.out.println("After Reversing the First digit and Last digit \nThe number is  "+  rev_num);
		
		}
		

}
