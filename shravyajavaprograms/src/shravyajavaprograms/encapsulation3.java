package shravyajavaprograms;

import java.util.Scanner;

public class encapsulation3 {
public static void main(String[] args) {
	stu s1=new stu();
	
	s1.read();
	s1.show();
}
}
class stu
{
	Scanner x=new Scanner(System.in);
	private String name;
	private int age;
	float per;
	  void read()
	{
	    System.out.println("enter a name age percentage");
	    name=x.next();
	    age=x.nextInt();
	    per=x.nextFloat();
		
	}
	  void show()
	  {
		  System.out.println(name+"\t"+age+"\t"+per);
	  }
}
