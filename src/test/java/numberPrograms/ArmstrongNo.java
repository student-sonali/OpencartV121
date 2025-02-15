package numberPrograms;

public class ArmstrongNo {

	public static void main(String[] args) 
	{
		int arm= 371;
		int sum=0;
		int org_arm=arm;
		
		while(arm!=0) 
		{
			sum=sum+(arm%10)*(arm%10)*(arm%10);
			arm=arm/10;
		}
		if(org_arm==sum) 
		{
			System.out.println("number is armstrong");
		}
		else 
		{
			System.out.println("number is not armstrong");
		}

	}

}
