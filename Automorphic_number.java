package pack1;
import java.util.Scanner;
public class Automorphic_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=obj.nextInt();
		int c=0,dig1,dig2,sq,digits;
		sq=n*n;
		digits=(int)Math.log10(n)+1;
		
		for(int i=0;i<digits;i++)
		{
			dig1=n%10;
			dig2=sq%10;
			if(dig1==dig2)
			{
				c++;
			}
			n/=10;
			sq/=10;
		}
		if(c==digits)
			System.out.println("It is a Automorphic number");
		else
			System.out.println("It is not a Automorphic number");
		
	}

}
