import java.util.*;
import java.util.Scanner;
public class SimpleCollection 
{
	ArrayList <Integer> intCol=new ArrayList <Integer>();
	public void getData() 
	{
		int a;
		char ans='y';
		
		Scanner in = new Scanner(System.in);
		while(ans=='y')
		{
			System.out.print("Enter A Number:");
			a =in.nextInt();
			intCol.add(a);
			System.out.print("Continue (y/n)");
			ans=in.next().charAt(0);
		} 
	}
		
		
	
	public void show()
	{
		
		intCol.sort(null);
		for(int num:intCol)
		{
			System.out.println("Number="+num);
		}
	}
}

