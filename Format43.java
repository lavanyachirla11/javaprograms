package formats;

import java.util.Scanner;

public class Format43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int space=n-1;
		int stars=n*2-1;
		for(int i=n; i>=1; i--) 
		{
			for(int j =space; j>= i; j--)
				System.out.print(" "); 
			
			for(int k=1; k<= stars; k++ ) 
			{
				
					System.out.print(stars); 
					
			} 
			
			System.out.println();
			stars= stars-2;
		}

	}

}
/*Sample Output:
Enter n value : 5
999999999
 7777777
  55555
   333
    1

*/