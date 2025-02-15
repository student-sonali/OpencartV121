package numberPrograms;

public class SumOfNo {

	public static void main(String[] args)
	{
		int num=23334;
		int sum=0;
		while(num!=0) 
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);

	}

}
