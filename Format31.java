package formats;
import java.util.Scanner;
public class Format31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
        int x=1;
		
		for(int i=1; i<=n; i++) 
		{
			for(int j =n-1; j>= i; j--)
				System.out.print(" "); 
			
			for(int k=1; k<= x; k++ ) 
				System.out.print(x); 
			
			System.out.println();
			x= x+2; 	
		}

	}

}
/*Sample Output-
Enter n value : 5
    1
   333
  55555
 7777777
999999999
*/