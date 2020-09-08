package pack1;
import java.util.Scanner;
public class Pronic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=obj.nextInt();
		int x=0;
		for(int i=0;i<n;i++)
		{
			if(i*(i+1)==n)
			{
				x=1;
				break;
			}
		}
		if(x==1)
		{
			System.out.println(n+" is a Pronic number ");
			
		}
		else
		{
			System.out.println(n+" is not a Pronic number ");
		}	

	}

}
