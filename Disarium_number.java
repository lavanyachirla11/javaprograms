package pack1;
import java.util.*;
public class Disarium_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n=sc.nextInt();
		int len=(int)Math.log10(n)+1;;
		int sum=0,num=n;
		while(n>0)
		{
			int rem=n%10;
			sum=sum+(int)Math.pow(rem,len);
			n=n/10;
			len--;
		}
		if(sum==num)
			System.out.println(num+" is a Disarium number");
		else
			System.out.println(num+" is not a Disarium number");
	}

}
