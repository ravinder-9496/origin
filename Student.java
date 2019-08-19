
public class Student 
{
	String stuname;
	int rollno;
	int stuclass;
	int marks;
	String college;
	Student(String name,int rno,int sclass,int m,String coll)
	{
		stuname=name;
		rollno=rno;
		stuclass=sclass;
		marks=m;
		college=coll;
	}
	public String toString()
	{
		return "Name:"+stuname+"\n"+"Roll No:"+rollno+"\n"+"Class:"+stuclass+"\n"+"Marks:"+marks+"\n"+"College:"+college+"\n\n";
	}
}


