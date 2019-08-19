import java.util.*;
public class StudentDetails 
{
	LinkedList <Student> stdList = new LinkedList<Student>();
	public void stuDetails()
	{
		stdList.add(new Student("Johnny Depp", 10, 9,67 , "Universal College of Pirates"));
		stdList.add(new Student("Christian Bale",1,12,92,"Gothams College of Judiciary"));
		stdList.add(new Student("Henry Cavil",5,12,89,"Kal-El Krypton College"));
		for(Student stu:stdList)
		{
			System.out.println("Student "+stu+"\n");
		}
	}
}


