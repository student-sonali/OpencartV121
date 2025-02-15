package stringPrograms;

public class PalindromeString {

	public static void main(String[] args)
	{
		String s= "lol";
		String rev="";
		String org_str=s;
		
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(org_str.equals(rev)) 
		{
			System.out.println("String is palindrome");
		}
		else 
		{
			System.out.println("String is not palindrome");
		}

	}

}
