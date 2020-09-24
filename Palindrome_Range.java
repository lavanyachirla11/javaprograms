package pack1;
import java.util.*;
public class Palindrome_Range {
	static int isPalindrome(int n) 
	{
		int rev =0;
		for(int i=n; i>0; i/=10) 
		{
		   rev = rev*10 + i%10; 		   
		}
		return (n==rev) ? 1 : 0;		
	}	
	
	static void display(int n1,int n2)
	{
		for(int i = n1; i <= n2; i++)
			if(isPalindrome(i)==1)
				System.out.print(i + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
	    int n1 = sc.nextInt(); 
	    int n2 = sc.nextInt(); 
	    System.out.println("Palindrome numbers in the given range are:");
	    display(n1,n2);
		
	}

}
