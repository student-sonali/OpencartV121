package arrayPrograms;

public class FindEvenOddElementsInArray {

	public static void main(String[] args)
	{
		int a[]= {4,6,7,3,5,6,};
		
		System.out.println("Even numbers:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2==0) 
			{
				System.out.println(a[i]);
			}
		}
		
		System.out.println("Odd numbers:");
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
		}
		

	}

}
