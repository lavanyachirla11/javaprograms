package formats;
import java.util.Scanner;
public class Format53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter n value : ");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = n; i >= -n; i--) 
		{
			for(int j=1; j<=Math.abs(i); j++)
			 System.out.print(" "); 
			
			for(int k=n; k>= Math.abs(i);k--)
				System.out.print(k); 
			System.out.println();
		}

	}

}
/*Sample Output:
Enter n value : 3
   3
  32
 321
3210
 321
  32
   3
*/