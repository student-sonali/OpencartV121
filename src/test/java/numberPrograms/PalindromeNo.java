package numberPrograms;

public class PalindromeNo {

	public static void main(String[] args)
	{
		
		int num= 121;
		int rev=0;
		int org_num=num;
		
		while(num!=0) 
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		if(org_num==rev) 
		{
			System.out.println("number is palindrome");
		}
		else 
		{
			System.out.println("number is not palindrome");
			
		}

	}

}
