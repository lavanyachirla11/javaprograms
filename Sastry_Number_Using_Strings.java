package pack1;
import java.util.Scanner;
public class Sastry_Number_Using_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = sc.nextInt();
		
		String str = Integer.toString(n) + Integer.toString(n+1);// str = 183184
	    int num = Integer.valueOf(str); 
	    
	    double sr = Math.sqrt(num);
	    if((sr - Math.floor(sr)) == 0 ) 
	    	System.out.println(n+" is a sastry number");
	    else
	    	System.out.println(n+"is not a sastry number");

	}

}
