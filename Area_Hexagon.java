package program_basic_formulas;
import java.util.Scanner;
public class Area_Hexagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of a side : ");
		double s= sc.nextDouble();
		double a = (3*Math.sqrt(3)*(s*s))/2;
		System.out.println("Area of Hexagon = "+a);

	}

}
