package shravyajavaprograms;

public class staticvariable {
public static void main(String[] args) {
	student s1=new student("Ramesh",20,8.4f);
	student s2=new student("Suresh",30,9.2f);
	student s3=new student("Vinay",34,7.6f);
	
	System.out.printf(student.college);
	student.college="SSIT";
	System.out.println(student.college);
	s1.name="kiran";
	s1.show();
	s2.show();
	s3.show();
}
}
class student 
{
	String name;
	int age;
	float cgpa;
	static String college="CIT";
	
	student(String n,int a,float c)
	{
		name=n;
		age=a;
		cgpa=c;
	}
	void show()
	{
		System.out.println(name+"\t"+age+"\t"+cgpa+"\t"+college);
	}
}
