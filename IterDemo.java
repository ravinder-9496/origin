import java.util.*;
public class IterDemo 
{
	ArrayList<String> al=new ArrayList<String>();
	public void demo()
	{
		al.add("First");
		al.add("Second");
		al.add("Third");
		al.add("Fourth");
		al.add("Fifth");		
		System.out.println("Using List Iterator to Display Contents");
		ListIterator<String> ltr=al.listIterator();
		while(ltr.hasNext())
		{
			System.out.println("List Element:"+ltr.next());
		}
		System.out.println("Using List Iterator to Display Contents  Backwards");
		
		while(ltr.hasPrevious())
		{
			System.out.println("List Element:"+ltr.previous());
		}
	}
}



