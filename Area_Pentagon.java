package program_basic_formulas;
import java.util.Scanner;
public class Area_Pentagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner obj = new Scanner (System.in);
		  System.out.print("Enter side value : ");
		  int s = obj.nextInt();
		  System.out.print("Enter apothem length : ");
		  int a = obj.nextInt();
		  float area = (float)(5.0/2.0)*s*a;
		  System.out.println("Area of Pentagon = "+area);

	}

}
