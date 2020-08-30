package pack1;
import java.util.*;
public class Given_term_is_Fibonacci_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter number to check whether it is Fibonacci or not : ");
		int n = sc.nextInt();
		int a=0,b=1,c=0;
        while(c<n)   
		{
			c=a+b;  
			a=b; 
			b=c;  
		}
		if(n==c)
		{
			System.out.println(n+" is a Fibonacci Number");
		}
		else
		{
			System.out.println(n+" is not a Fibonacci Number");
		}

	}

}
