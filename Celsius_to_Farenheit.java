package program_basic_formulas;
import java.util.Scanner;
public class Celsius_to_Farenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  float f,c;
		  System.out.print("Enter Celsius temperature : ");
		  c = sc.nextFloat();
		  f = ((c*9)/5)+32;
		  System.out.println("The Temperature in Farenheit = "+f);

	}

}
