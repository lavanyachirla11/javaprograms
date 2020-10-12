package formats;
import java.util.Scanner;
public class Format23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n value : ");
		int n = sc.nextInt();
		 for (int i=1; i<=n; i++) 
         { 
             System.out.print(i+" ");  
         for (int j=1; j<=i; j++ ) 
         { 
             System.out.print("* "); 
         } 

         System.out.println();
         }

	}

}

/*Sample Output:
Enter n value : 6
1 * 
2 * * 
3 * * * 
4 * * * * 
5 * * * * * 
6 * * * * * * 

*/
