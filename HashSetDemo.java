
import java.util.*;
public class HashSetDemo {
	LinkedHashSet<String> hashStr = new LinkedHashSet<String>() ;
	public void assignValues()
	{
		hashStr.add("Where");
		hashStr.add("do");
		hashStr.add("you");
		hashStr.add("want");
		hashStr.add("to");
		hashStr.add("go?");
		System.out.println("Hashset = "+hashStr);
	}

}



