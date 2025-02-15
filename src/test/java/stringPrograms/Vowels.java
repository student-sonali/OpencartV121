package stringPrograms;

public class Vowels {

	public static void main(String[] args)
	{
		String s="sonali vivan";
	   char a[]=s.toCharArray();
	   int vowel_count=0;
	   int constant_count=0;
	    
	    for(int i=0;i<=s.length()-1;i++) 
	    {
	    	if(a[i]=='a'|| a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ) 
	    	{
	    		System.out.println("vowels are="+ a[i]);
	    		vowel_count++;
	    		
	    	}
	    	else 
	    	{
	    		System.out.println("constants are="+ a[i]);
	    		constant_count++;
	    		
	    	}
	    }
	    System.out.println(vowel_count);
	    System.out.println(constant_count);

	}

}
