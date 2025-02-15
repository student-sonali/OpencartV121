package arrayPrograms;

public class FindDuplicateInArray {

	public static void main(String[] args) 
	{
		String a[]= {"sonali","vivan","sonali","myra"};
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) 
		{
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]==a[j]) 
				{
					System.out.println("duplicate found:"+ a[i]);
					flag=true;
				}
			}
		}
		if(flag==false) 
		{
			System.out.println("duplicate not found");
		}

	}

}
