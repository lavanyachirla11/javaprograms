package pack1;
import java.util.*;
public class Happy_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		int result=n;
		int num=n;
		while(result!=1 && result!=4)
		{
			result=print(result);
		}
		if(result ==1 )
			System.out.println(num + " is a Happy Number");
		else
			System.out.println(num+ " is Not Happy Number");	

	}
	static int print(int n)
	{
		int sum=0;
		while(n>0)
		{
		int rem=n%10;
		sum=sum+rem*rem;
		n=n/10;
		}
		return sum;
	}

}
