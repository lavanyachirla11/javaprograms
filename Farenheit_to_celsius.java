package program_basic_formulas;
import java.util.Scanner;
public class Farenheit_to_celsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  float f,c;
		  System.out.print("Enter Farenheit temperature :");
		  f = sc.nextFloat();
		  c = ((f-32)*5)/9;
		  System.out.println("The Tempereture in Celsius = "+c);

	}

}
