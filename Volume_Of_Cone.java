package program_basic_formulas;
import java.util.Scanner;
public class Volume_Of_Cone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter radius:");
		int r = obj.nextInt();
		System.out.print("Enter height:");
		int h = obj.nextInt();	
		double v = 3.14 * (r*r)*h / 3;
	    System.out.println("Volume of cone = "+ v);

	}

}
