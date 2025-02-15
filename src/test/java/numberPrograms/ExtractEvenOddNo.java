package numberPrograms;

public class ExtractEvenOddNo 
{

	public static void main(String[] args)
	{
		int num=34579321;
		int rem=0;
		System.out.println("Even numbers");
		while(num!=0) 
		{
			rem=num%10;
			if(rem%2==0) 
			{
				System.out.println(rem);
			}
			num=num/10;
		}
		
		System.out.println("odd numbers");
		while(num!=0) 
		{
			rem=num%10;
			if(rem%2!=0) 
			{
				System.out.println(rem);
			}
			num=num/10;
			
		}

	}

}
