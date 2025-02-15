package stringPrograms;

public class ReverseEachWord {

	public static void main(String[] args)
	{
		String s= "sonali jadhav";
		String rev= "";
    	String w[]=	s.split(" ");
    	
    	for(String word:w) 
    	{
    		String reverse="";
    		for(int i=word.length()-1;i>=0;i--) 
    		{
    			reverse=reverse+word.charAt(i);
    		}
    		rev=rev+reverse+" ";

    	}
    	System.out.println(rev);

	}

}
