package stringPrograms;

public class RemoveJunkInString {

	public static void main(String[] args)
	{
		String s="@$%&&)(*sonali|}{*%$%#@@";
	s=	s.replaceAll("[^A-za-z0-9]" ,"");
	System.out.println(s);

	}

}
