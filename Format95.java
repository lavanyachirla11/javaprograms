package formats;
import java.util.Scanner;
public class Format95 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int x=1;

		for(int i=1; i<= n; i++) 
		{
			for(int j=1; j <=n; j++)
			{
				
				if(j <=x || j >=n-x+1 ) 
					System.out.print((char)(i+64)); 
				else
					System.out.print(" ");
				
			}
			System.out.println();
			if(i<=n/2)
				x=x+1;
			else
				x=x-1;
			
		}
		
	}

}
/*Sample Output:
Enter n value : 5
A   A
BB BB
CCCCC
DD DD
E   E
*/