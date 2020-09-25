package formula_based_programs;
import java.util.Scanner;
public class Square_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter number : ");
		double x = obj.nextDouble();
		double sr = Math.sqrt(x);
		if( ( sr - Math.floor(sr)) == 0)
			 System.out.println("Square Number");
		else
			System.out.println(" Not Square Number ");

	}

}
