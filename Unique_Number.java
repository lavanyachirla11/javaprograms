package pack1;
import java.util.Scanner;
public class Unique_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int no=n, c, flag=1;
		for(int i=0;i<=9;i++)
		{
			n=no;
			c=0;
			while(n > 0)
			{
				int d=n%10;
				if(d==i)
					c++;
				n /= 10;
			}
			if(c>1)
			   {
				flag=0;
				break;
			   }
		   
		}
		if(flag==1)
		{
			System.out.print(no+" Unique Number ");
		}
		else
		{
			System.out.print(no+" Not a Unique Number ");
		}

	}

}
