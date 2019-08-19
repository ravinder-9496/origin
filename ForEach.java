import java.util.*;
public class ForEach 
{
	ArrayList<Integer> ai=new ArrayList<Integer>();
	ArrayList<String> as =new ArrayList<String>();
	public void forDemo()
	{
		for(int i=1;i<6;i++)
			ai.add(i*5);
		as.add("The");
		as.add("Dark");
		as.add("Knight");
		as.add("Rises");
		System.out.println("Displaying ArrayList of Integers");
		for(int x:ai)
		{
			System.out.print(x);
			System.out.print(" ");
		}
		System.out.println();
		System.out.println("Displaying ArrayList of Strings");
		
		for(String s:as)
		{
			System.out.print(s);
			System.out.print(" ");
		}
	}
}


