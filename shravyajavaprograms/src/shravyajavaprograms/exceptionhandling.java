package shravyajavaprograms;

public class exceptionhandling {
public static void main(String[] args) {
	try
	{
		int a=10/0;
		System.out.println("a="+a);
	}
	catch(NumberFormatException e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.println("hello");
	}
	System.out.println("thnak you");
	
}
}
