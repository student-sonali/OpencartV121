package stringPrograms;

public class FindDuplicateChar {

	public static void main(String[] args)
	{
		String s= "sonali vivan";
		char a[]=s.toCharArray();
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1; j<a.length;j++) 
			{
				if(a[i]==a[j]) {
				System.out.println("duplicates characters="+ a[i]);
				count++;
			}
			
		}
		}
		System.out.println(count);

	}

}
