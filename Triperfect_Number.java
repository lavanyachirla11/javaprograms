package pack1;
import java.util.*;
public class Triperfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		
		int i=2;
		int sum=n+1;
		while(i*i<n)
		{
			
			if(n%i==0)
			{
				if(n/i==i)
					sum=sum+i;
				else
					sum=sum+i+n/i;
			}
				i++;
		}
		if(sum==3*n)
			System.out.println(n+" is a triperfect number");
		else
			System.out.println(n+" is not a triperfect number");
		

	}

}
