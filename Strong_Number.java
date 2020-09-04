package pack1;
import java.util.Scanner;
public class Strong_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n : ");
		int n=sc.nextInt();
		int temp,sum=0,i,rem,fact;
		temp=n;
		while(n!=0)
		{
			fact=1;
			rem=n%10;
			i=1;
			while(i<=rem)
			{
				fact=fact*i;
				i++;
			}
			sum += fact;
			n /= 10;
		}
			if(temp==sum)
			    System.out.print(temp+" is a Strong Number");
			else
				System.out.print(temp+" is not a Strong Number");
			
	}

}
