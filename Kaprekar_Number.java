package pack1;
import java.util.*;
public class Kaprekar_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt(); 	
		int count = 0,firstpart= 0,secondpart = 0,sum = 0;
		int square = n*n; 
		int temp = square; 
		while(temp != 0) 
		{
			count++; 
			temp = temp/10; 
		}	
		for(int i=count-1; i>0; i--)	
		{
			firstpart = square / (int)Math.pow(10,i); 
			secondpart = square % (int)Math.pow(10,i);
			if(firstpart == 0 || secondpart == 0 )
				continue;
			
			sum = firstpart + secondpart; 
			if(sum == n )
			{
			System.out.println(n + " is a Kaprekar Number");
			break;
			}
		}	
		if(sum != n)
			System.out.println(n+" is Not a Kaprekar Number");
	}

}
