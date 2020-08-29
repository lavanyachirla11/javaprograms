package pack1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter limit upto which do u want Fibonacci series : ");
		int n = sc.nextInt();
		int n1=0,n2=1,sum=0;
		System.out.print(n1+" "+n2+" ");
		while(n1+n2<n)
		{
			sum=n1+n2;
			
            System.out.print(sum+" ");
            n1=n2;
			n2=sum;
		}
	

	}

}
