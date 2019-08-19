import java.util.*;
public class ArList {
	ArrayList<String> ars=new ArrayList<String>();
	public void getdata()
	{
		System.out.print("Initial Size:");
		System.out.println(ars.size());
		ars.add("This");
		ars.add("is an");
		ars.add("Array");
		ars.add("List");
		ars.add("-");
		ars.add("a type");
		ars.add("of");
		ars.add("Collection");
		System.out.print("Size after adding elements:");
		System.out.println(ars.size());
	System.out.println("Contents of Array List:"+ars);
	}
	public void delElements()
	{
		
		ars.remove("List");
		ars.remove(1);
		System.out.println("Contents of Array List after removing elements:"+ars);
	}
	public String makeOneString()
	{
		String retStr="";
		for (String str:ars)
			retStr=retStr+str+" ";
		return retStr; 
	}
	}

