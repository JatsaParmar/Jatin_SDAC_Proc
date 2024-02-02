//convert lower to upper and vice versa
package jatin;
import java.lang.Character;

public class qrt{
	public static void lowupcase(String str)//jAtIN
	{
		String finall ="";
		for(int i = 0;i<=str.length()-1;i++)
		{
			Character c = str.charAt(i);
			
			if(Character.isUpperCase(c) )
			{
				
				finall =  finall + c.toLowerCase(c);
			}
			else
			{
				
				finall =  finall + c.toUpperCase(c);
			}
		}
		System.out.println(finall);
		
	};
	
	public static void main(String args[])
	{
		lowupcase("jAtIN");
	}
}

