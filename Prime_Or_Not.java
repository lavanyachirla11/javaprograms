package pack1;
import java.util.Scanner;
public class Prime_Or_Not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		int count = 0;
		for(int i=1;i<= n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.print(n+" is Prime number");
		}
		else
		{
			System.out.print(n+" is not Prime number");
		}

	}

}
