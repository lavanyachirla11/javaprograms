package pack1;
import java.util.Scanner;
public class Prime_numbers_between_given_limit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		  System.out.print("Enter 2 numbers : ");
		  int n1 = sc.nextInt(); 
		  int n2 = sc.nextInt();  
		  String p="";
		  for(int i = n1+1; i < n2 ; i++ )  
		  {
			  int c = 0;
			  for(int n=i ; n>= 1; n--)  
			  {
				  if (i%n ==0) 
				   { c= c+1; } 
			  }  
			  if(c==2)
				  p = p + i + " ";
			  
		   }
		  System.out.println(p);

	}

}
