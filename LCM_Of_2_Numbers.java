package pack1;
import java.util.Scanner;
public class LCM_Of_2_Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int gcd=1,lcm;
		for(int i=1 ;i<=((n1<n2)?n1:n2);i++)
		{
			if(n1%i==0 && n2%i==0 )
			{
				gcd=i;
			}
		}		
		lcm=(n1*n2)/gcd;
		System.out.println("LCM of "+n1+" and "+n2+" is "+lcm);

	}

}
