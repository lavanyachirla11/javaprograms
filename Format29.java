package formats;

import java.util.Scanner;

public class Format29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		int stars = 1;
		int space = n-1; 
		
		for(int i=1; i<=n;i++) 
		{
			for(int j=space; j>=i;j--)			
				System.out.print(" ");
			
			for(int k =1;k<=stars;k++) 
				System.out.print("*"); 
			
			System.out.println();
				stars=stars+2;
		}	
	}

}
/*Sample Output:
Enter n value : 9
        *
       ***
      *****
     *******
    *********
   ***********
  *************
 ***************
*****************

*/
