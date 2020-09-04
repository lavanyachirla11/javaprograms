package pack1;
import java.util.Scanner;
public class Spy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int temp,sum=0,product=1,rem;
		temp=n;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n /= 10;
			
		}
		if(sum==product)
			System.out.print(temp+" is a Spy Number");
		else
			System.out.print(temp+" is not a Spy Number");
		

	}

}
