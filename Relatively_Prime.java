package pack1;
import java.util.*;
public class Relatively_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd=1;
		for(int i=1 ;i<=((n1<n2)?n1:n2);i++)
		{
			if(n1%i==0 && n2%i==0 )
			{
				gcd=i;
			}
		}
		if(gcd == 1)
			System.out.println(n1+" and "+n2+" are Relatively Prime");
		else
			System.out.println(n1+" and "+n2+" are not Relatively Prime");

	}

}
