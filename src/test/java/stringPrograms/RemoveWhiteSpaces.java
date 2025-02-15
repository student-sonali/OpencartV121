package stringPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args)
	{
		
		String s= "sonali    jadhav  vivan";
	 s=	s.replaceAll("\\s", "");
       System.out.println(s);
	}

}
