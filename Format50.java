package formats;

import java.util.Scanner;

public class Format50 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		for(int i=n; i>=-n; i--) 
		{
			for(int j =Math.abs(i); j<=n; j++)
				System.out.print((char)(j+65)+" "); 
			
		System.out.println();
		}
	}

}
/*Sample Output:
Enter n value : 3
D 
C D 
B C D 
A B C D 
B C D 
C D 
D 
*/
