package program_basic_formulas;
import java.util.Scanner;
public class Area_Equilateral_Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter side of a triangle : ");
		float s = sc.nextFloat();		
		float a = (1.73f * s *s )/4;		
		System.out.println("Area of Equilateral Triangle = "+a);

	}

}
