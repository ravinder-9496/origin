import java.util.*;
public class FromListtoArray 
{
ArrayList<Integer> fla=new ArrayList<Integer>();
public void getData()
{
	fla.add(1);
	fla.add(2);
	fla.add(3);
	fla.add(4);
	fla.add(5);
	
	System.out.println("Array List = "+fla);
	Integer ia[] = new Integer[fla.size()];
	ia=fla.toArray(ia);
	System.out.println("Contents of the new array");
	for(int i:ia)
		System.out.println(i);
	
}
}


