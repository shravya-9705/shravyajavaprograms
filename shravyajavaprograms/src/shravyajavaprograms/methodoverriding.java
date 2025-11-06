package shravyajavaprograms;

public class methodoverriding {
	public static void main(String[] args)
	{
		polygon t=new polygon();
		t.greet();
		t.nos();
		t.area();
	}
}
class polygon
{
	void greet()
	{
		System.out.println("good morning");
	}
	void nos()
	{
		System.out.println("polygon have many slides");
	}
	void area()
	{
		System.out.println("polygon have area");
	}
}
class reactangle extends polygon
{
	void nos()
	{
		System.out.println("i have r sides");
	}
	void area()
	{
		System.out.println("area=length * breadth");
	}
}
