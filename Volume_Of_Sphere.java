package program_basic_formulas;
import java.util.Scanner;
public class Volume_Of_Sphere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		 System.out.print("Enter radius : ");
		 int  r = obj.nextInt();
		 double v = (4.0/3.0)*3.14*(r*r*r);
	     System.out.println("Volume of sphere = "+v);

	}

}
