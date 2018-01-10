import java.util.*;
public class VowelCounter 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string");
		String text = input.next();
		vowelCounter(text);
	}
	
	public static void vowelCounter(String text)
	{
		int a=0;
		int e=0;
		int i=0;
		int o=0;
		int u=0;
		int total;
		char c;
		text.toUpperCase();
		for(int j = 0; j<text.length(); j++)
		{
			c = text.charAt(j);
			System.out.print(c);
			if(c == 'a')
				a = a+1;
			if(c == 'e')
				e = e+1;
			if(c == 'i')
				i = i+1;
			if(c == 'o')
				o = o+1;
			if(c == 'u')
				u = u+1;
		}
		System.out.println("There are " + a + " a(s)");
		System.out.println("There are " + e + " e(s)");
		System.out.println("There are " + i + " i(s)");
		System.out.println("There are " + o + " o(s)");
		System.out.println("There are " + u + " u(s)");
		System.out.println("Total amount of vowels " + (a+e+i+o+u));
	}
}
