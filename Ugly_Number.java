package pack1;
import java.util.Scanner;
public class Ugly_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int x=0,temp=n; 
		while(n != 1) 
		{
			if(n%5==0)  
	        n = n/5;			
			else if(n%3==0)
			n = n/3 ; 
			else if(n%2==0) 
			n = n/2;
			else
			{ 
			x= 1;
			break;
			}
		}
		 if(x==0)
			 System.out.println(temp+" is a Ugly Number");
		 else
			 System.out.println(temp+"is Not a Ugly Number");
			
	}

}
