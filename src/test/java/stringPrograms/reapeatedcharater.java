package stringPrograms;

import java.util.HashMap;
import java.util.Map;

public class reapeatedcharater {

	public static void main(String[] args)
	{
		String s= "sonaliiii vivannnn";
		
		
		Map<Character, Integer> c= new HashMap<Character, Integer>();
		char a[]=s.toCharArray();
		for(char value :a) 
		{
			if(Character.isAlphabetic(value)) 
			{
				if(c.containsKey(value)) 
				{
					c.put(value, c.get(value)+1);
				}
				else 
				{
					c.put(value, 1);
				}
			}
		}
		System.out.println(c);

	}

}
