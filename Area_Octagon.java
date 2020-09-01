package program_basic_formulas;
import java.util.Scanner;
public class Area_Octagon {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner obj = new Scanner(System.in);
		  System.out.print("Enter the length of a side : ");
		  float s = obj.nextFloat();
		  float a = (float)(2*(1+Math.sqrt(2)) * s *s);
		  System.out.println("Area of Octagon = "+ a);

	}

}
