package formats;

import java.util.Scanner;

public class Format42 {

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
				
					System.out.print(i); 
					
			} 
			
			System.out.println();
			stars= stars-2;
		}

	}

}
/*Sample Output:
Enter n value : 5
555555555
 4444444
  33333
   222
    1
*/