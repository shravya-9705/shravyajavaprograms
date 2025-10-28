package shravyajavaprograms;

import java.util.Scanner;

public class arithmeticopertators {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a,b,c,d;
	System.out.println("enter the numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	d=sc.nextInt();
	System.out.println(a+b-c);
	System.out.println((a*b)/c);
	System.out.println((a-b)*(c+d));
  }
}
