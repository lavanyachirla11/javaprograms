package pack1;
import java.util.Scanner;
public class Rare_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt(); 
		if (rare(n))  
		System.out.println("Rare Number");
		else
			System.out.println("Not Rare Number");
	}
	
	static int revdigits(int num) 
	{
		int rev =0;
		while(num>0) 
		{
			int rem = num%10;   
			rev = rev*10 + rem; 
			num = num/10;
		}
		
		return rev; 
	}
	
	static boolean rare(int N) 	{
		int revN = revdigits(N); 
		if( revN == N) 
			return false;
		
		return sq(N+ revN)  && sq(N-revN);		
		
	}
	
	static boolean sq(double x)
	{
		double sr = Math.sqrt(x);
		return (( sr - Math.floor(sr)) == 0);
	}

}

