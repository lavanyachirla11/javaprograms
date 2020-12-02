package stringprgms;
import java.util.*;
public class Camel_Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter String : ");
		String input = in.next(); 
		
		int len = input.length();  
		
		if(len == 0)
		{
			System.out.println(0);
		}
		
		int count = 1;
		
		for(int i =0; i<len; i++)
		{
			char c = input.charAt(i);
			if( 'A' <= c && c <='Z')
				count++; // 2
			else if(c == ' ')
				break;				
		}
		System.out.println(count);

	}

}
