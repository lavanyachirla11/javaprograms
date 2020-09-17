package pack1;
import java.util.*;
public class Armstrong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n=sc.nextInt();
		int temp=n,sum=0;
		int t=(int)Math.log10(n)+1;
		while(temp>0) {
		int r=temp%10;
		sum=sum+(int)(Math.pow(r,t));
		temp/=10;
		}
		if(sum==n) 
			System.out.println(n+" is a Armstrong Number");
		else 
			System.out.println(n+" is not a Armstrong Number");

	}

}
