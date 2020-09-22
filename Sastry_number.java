package pack1;
import java.util.*;
public class Sastry_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int n = sc.nextInt();
		int digits = (int)Math.log10(n)+1;
		int num=n*(int)Math.pow(10,digits)+(n+1);
		double sr = Math.sqrt(num);
		if(sr-Math.floor(sr)==0)
			System.out.println(n+" is a Sastry number");
		else
			System.out.println(n+" is not a Sastry number");

	}

}
