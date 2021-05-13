package collections;

class Student 
{
	int rollno;
	String name;
	String dept;
	void insert(int r,String n,String d)
	{
		rollno=r;
		name=n;
		dept=d;
	}
	void display()
	{
		System.out.println(rollno+" "+name+" "+dept);
	}
}

public class MainClass{
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insert(123,"Ayyappa","E.C.E");
		s2.insert(456,"Kumar","C.S.E");
		s1.display();
		s2.display();
	}
	
}