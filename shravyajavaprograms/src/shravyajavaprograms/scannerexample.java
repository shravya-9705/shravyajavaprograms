package shravyajavaprograms;
import java.util.Scanner;
public class scannerexample{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a;
		int c;
		float h;
		System.out.println("enter name,age,cgpa");
		a=sc.next();
		c=sc.nextInt();
		h=sc.nextFloat();
		System.out.println("my name="+a+"\nmy age="+c+"\nmy cgpa="+h);
	}

}
