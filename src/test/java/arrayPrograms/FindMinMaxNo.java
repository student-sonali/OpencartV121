
package arrayPrograms;

public class FindMinMaxNo {

	public static void main(String[] args) 
	{
		int a[]= {3,5,2,0,5,7};
		int min=a[0];
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
		}
		System.out.println("minimum no are:"+ min);
		
		int max=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
		}
		System.out.println("minimum no are:"+ max);

	}

}
