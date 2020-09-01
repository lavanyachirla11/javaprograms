package pack1;
import java.util.Scanner;
public class Number_Positive_Or_Negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		  System.out.print("Enter size:");
		  int n = sc.nextInt();  
		  
		  int a[] = new int[n];
		  
		  for(int i = 0; i <n ; i++)  
		  {
			  a[i] = sc.nextInt();
		  }
		  
		  for(int i=0; i<n ; i++)
		  {
			  if(a[i] > 0)
				  System.out.println(a[i]+" is Positive");
			  else
				  System.out.println(a[i]+" is Negative");
		  }

	}

}
