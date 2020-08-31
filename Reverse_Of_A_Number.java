package pack1;
import java.util.Scanner;
public class Reverse_Of_A_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number : ");
		int n=sc.nextInt();
		int temp,rev=0,digit;
		temp=n;
		while(temp!=0)
		{
			digit=temp%10;
			rev=rev*10+digit;
			temp /=10;
		}
		System.out.println("Reverse of "+n+" is "+rev);

	}

}
