package arrayPrograms;

public class Linear_search {

	public static void main(String[] args) 
	{
		int a[]= {4,5,3,6,7};
		int linear_search=5;
		boolean flag =false;
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==linear_search) 
			{
				System.out.println("found linear no:"+ a[i]);
				flag=true;
			}
		}
		if(flag==false) 
		{
			System.out.println("linear no not found");
		}

	}

}
