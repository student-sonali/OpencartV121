package numberPrograms;

import java.util.Scanner;

public class ReverseNo {

	public static void main(String[] args)
	{
	//	Scanner sc =new Scanner(System.in);
	 //   int num=sc.nextInt();
	   // System.out.println("Enter the Number");
		int num=94785;
	    int rev=0;
	    
	    while(num!=0) 
	    {
	    	rev=rev*10+num%10;
	    	num=num/10;
	    }
	    System.out.println(rev);

	}

}
