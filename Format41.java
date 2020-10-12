package formats;
import java.util.Scanner;
public class Format41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int space=n-1;
		int star=n*2-1;
		for(int i=n; i>=1; i--) 
		{
			for(int j =space; j>= i; j--)
				System.out.print(" "); 
			
			for(int k=1; k<= star; k++ ) 
			{
				
					System.out.print("*"); 
					
			} 
			
			System.out.println();
			star= star-2;
		}

	}

}
/* Sample output:
Enter n value : 5
*********
 *******
  *****
   ***
    *
 
*/
