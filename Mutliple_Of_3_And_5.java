package pack1;
import java.util.Scanner;
public class Mutliple_Of_3_And_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter 2 numbers : ");
		  int s = sc.nextInt(); 
		  int n = sc.nextInt(); 
		  System.out.print("Multiples of 3 and 5 are in the given range are : ");
		  for(int i = s; i <= n ; i++)
		  {
			  if(i%3 == 0 && i%5 == 0)
				  System.out.print(i +" ");
		  }

	}

}
