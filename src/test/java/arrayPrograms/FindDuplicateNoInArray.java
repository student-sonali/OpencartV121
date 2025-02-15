package arrayPrograms;

public class FindDuplicateNoInArray {

	public static void main(String[] args)
	{
		int a[]= {2,3,1,6,7,2,6};
		int count=0;
		
		for(int i= 0;i<a.length;i++) 
		{
			for(int j=i+1; j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("duplicates are:"+ a[i]);
					count++;
				}
			}
		}
		System.out.println(count);

	}

}
