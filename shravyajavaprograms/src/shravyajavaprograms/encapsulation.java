package shravyajavaprograms;
//we can print a values outside the class
import java.util.Scanner;
public class encapsulation {
public static void main(String[] args) {
		student11 s1=new student11();
		
		s1.read();
		
		System.out.println(s1.name+"\t"+s1.age+"\t"+s1.per);
	}
	}
	class student11
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


