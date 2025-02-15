package stringPrograms;

public class ReverseWords {

	public static void main(String[] args) 
	{
	     String s="sonali jadhav";
	     String rev="";
	     
	     String w[]= s.split(" ");
	     
	     for(int i=w.length-1;i>=0;i--) 
	     {
	    	 rev=rev+w[i]+" ";
	     }
	     System.out.println(rev);

	}

}
