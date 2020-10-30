package stringprgms;
import java.util.Scanner;
public class No_of_vowels_consonants_digits_spaces_in_a_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str  = sc.nextLine(); 
		int vowels=0,cons=0,digits=0,spaces=0,specialcharacters =0;
		str = str.toLowerCase();
		for( int i=0; i<str.length(); i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a'||ch =='e'||ch=='i'||ch=='o'||ch=='u')
				vowels = vowels+1;
			else if (ch >= 'a' && ch <='z')
				cons=cons+1;
			else if (ch >='0' && ch <= '9')
				digits = digits+1;
			else if(ch == ' ')
				spaces = spaces+1;
			else
				specialcharacters +=1;
		}
		System.out.println("Vowels = "+ vowels);
		System.out.println("Consonants = "+ cons);
		System.out.println("Digits = "+ digits);
		System.out.println("Spaces = "+ spaces);
		System.out.println("Specialcharacters = "+ specialcharacters);

	}

}
/*Sample Output:
 
*/