package program_basic_formulas;
import java.util.Scanner;
public class Ohms_Law {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj = new Scanner(System.in);
		  String ch;
		  float voltage, current, resistance, result;
		  System.out.println("Ohms Law:");
		  System.out.println("---------");
		  System.out.println("1.calculate voltage");
		  System.out.println("2.calculate current");
		  System.out.println("3.calculate resistance");
		  
		  System.out.print("Enter choice[1,2,3] : ");
		  ch = obj.next();
		  
		  switch(ch)
		  {
		  case "1": 
			  System.out.print("Enter current value : ");
			  current = obj.nextFloat();
			  System.out.print("Enter resistance value : ");
			  resistance = obj.nextFloat();
			  result = current * resistance;
			  System.out.print("voltage = "+result);
			  break;
		  case "2":
			  System.out.print("Enter voltage value : ");
			  voltage = obj.nextFloat();
			  System.out.print("Enter resistance value : ");
			  resistance = obj.nextFloat();
			  result = voltage/resistance;
			  System.out.print("current = "+result);
			  break;
		  case "3":
			  System.out.print("Enter current value : ");
			  current = obj.nextFloat();
			  System.out.print("Enter voltage value : ");
			  voltage = obj.nextFloat();
			  result = voltage/current;
			  System.out.print("resistance = "+result);
			  break;	  
		}

	}

}
