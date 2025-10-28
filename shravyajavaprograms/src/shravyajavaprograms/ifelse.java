package shravyajavaprograms;
import java.util.Scanner;
public class ifelse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int m;
	System.out.println("enter month no.");
	m=sc.nextInt();
	if(m==2)
		System.out.println("28 days");
	else if(m==4||m==6||m==9||m==11)
		System.out.println("30 days");
	else if(m==1||m==3||m==5||m==7)
		System.out.println("31 days");
	else
		System.out.println("invalid");
}
}
