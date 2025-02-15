package numberPrograms;

public class CountNumbers {

	public static void main(String[] args)
	{
		int num= 2345671;
		int count=0;
		
		while(num!=0) 
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
		

	}

}
