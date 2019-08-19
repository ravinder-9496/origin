import java.util.*;
public class LinkListDemo 
{
	LinkedList<String> llStr =new LinkedList<String>();
	public void demoLinkLIst()
	{
		llStr.add("First");
		llStr.add("thing");
		llStr.add("First");
		llStr.addFirst("Last");
		llStr.add("thing");
		llStr.addLast("Last");
		llStr.add("What Else to Add?");
		System.out.println("Contents of the Linked List:"+llStr);
		llStr.remove("First");
		llStr.remove(3);
		System.out.println("After Deleting Nodes of the Linked List:"+llStr);
		llStr.removeFirst();
		llStr.removeLast();
		System.out.println("After Deleting Nodes of the Linked List:"+llStr);
		String val = llStr.get(2);
		llStr.set(2, val+ " Changed");		
		System.out.println("Contents of the Linked List:"+llStr);
	}
}
