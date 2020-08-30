package pack1;
import java.util.Scanner;
public class Number_Palindrome_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter array size :");
		int s = sc.nextInt();
		int n[]=new int[s];
		int r, sum, temp;
		System.out.println("Enter "+s+ " numbers :");
		for(int i=0; i<s; i++)
		{
			n[i] = sc.nextInt();
		}	
		for(int i=0;i<s; i++)
		{
			sum =0; 
			temp = n[i]; 
			
			while(n[i]>0) 
			{
				r = n[i]%10;  
				sum = (sum*10)+r;  
				n[i] = n[i]/10;  
			}
				if (temp == sum)			
					System.out.println(temp + " is a Palindrome");
					else
					System.out.println(temp + " is Not a palindrome");
		}	
	}
}