package pack1;
import java.util.Scanner;
public class Digit_FullEven_Or_FullOdd_Or_Mixed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int even_count=0,odd_count=0,digits,digit;
		digits=(int)Math.log10(n)+1;
		while(n!=0)
		{
			digit=n%10;
			if(digit%2==0)
				even_count++;
			else
				odd_count++;
			n /= 10;
		}
		if(even_count==digits)
		{
			System.out.println("Full Even number");
		}
		else if(odd_count==digits)
		{
			System.out.println("Full Odd number");
		}
		else
		{
			System.out.println("Mixed number");
		}

	}

}
