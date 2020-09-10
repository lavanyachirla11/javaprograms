package pack1;
import java.util.*;
public class Semi_Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter number:");
		  int num = sc.nextInt();  
		  int x=num;
		  int c=0;
		  for (int i = 2; c < 2 && i*i <= num; i++)  
		  {
			  while(num%i == 0)  
			  {
				  num = num/i;  
				  ++c;  
			  }
		  }	  
		 if(num>1)  
		 {
			 ++c;  
		 }	 
		 if(c == 2) 
			 System.out.println(x+" is a Semiprime number ");
		 else
			 System.out.println(x+" is not a  semiprime number ");

	}

}
