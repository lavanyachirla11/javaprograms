package formula_based_programs;
import java.util.Scanner;
public class Area_Hemisphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner obj = new Scanner(System.in);
		 System.out.print("Enter radius : ");
		 int r = obj.nextInt();
		 double v = (2.0/3.0)*(3.14)*(r*r*r);
	     System.out.println("Volume of Hemisphere = "+v);

	}

}
