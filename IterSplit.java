import java.util.*;
public class IterSplit 
{
	ArrayList<Double> doubArr=new ArrayList<Double>();
	public void demoSplit()
	{
		doubArr.add(1.0);
		doubArr.add(2.0);
		doubArr.add(3.0);
		doubArr.add(4.0);
		doubArr.add(5.0);
		System.out.println("The ArrayList contains:");
		Spliterator<Double> splitDoub = doubArr.spliterator();
		while(splitDoub.tryAdvance((n)->System.out.println(n)));
		System.out.println();
		
		
	}
}


