package shravyajavaprograms;

import java.util.Scanner;
//encapsulation: wrapping up the variable using private keyword
//we can't print a values in outside in encapsulation
public class encapsulation2{
public static void main(String[] args) {
student12 s1=new student12();
	
	s1.read();
	
	System.out.println(s1.name+"\t"+s1.age+"\t"+s1.per);
}
}
class student12
{
	Scanner x=new Scanner(System.in);
	String name;
	int age;
	float per;
	void read()
	{
	    System.out.println("enter a name age percentage");
	    name=x.next();
	    age=x.nextInt();
	    per=x.nextFloat();
		
	}

}
