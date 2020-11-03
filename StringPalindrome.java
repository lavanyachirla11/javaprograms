package stringprgms;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string : ");
		String str = sc.next(); 
		String rev ="";	
		int len = str.length(); 
		for(int i = len-1; i>=0; i--)
			rev = rev + str.charAt(i);
		
		if(str.equals(rev))
		System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is not a Palindrome");
        }
}