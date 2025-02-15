package arrayPrograms;

public class CountEvenOddNoInArray {

	public static void main(String[] args)
	{
		int a[]= {3,4,5,2,1,6,8};
		int even_count=0;
		int odd_count=0;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				even_count++;
			}
			else 
			{
				odd_count++;
				
			}
		}
		System.out.println("even elements:"+even_count);
		System.out.println("oddelements:"+odd_count);

	}

}
