package shravyajavaprograms;

public class interface1 {
public static void main(String[] args) {
	ccc11 c=new ccc11();
	
	c.sum(4, 5);
	c.sub(8, 5);
}
}
interface aaa
{
	public void sum(int a,int b);
	
}
interface bbb
{
	public void sub(int a,int b);
	
}
class ccc11 implements aaa,bbb
{
	public void sum(int a,int b)
	{
		System.out.println("sum="+(a+b));
	}
	public void sub(int a,int b)
	{
		System.out.println("sub="+(a-b));
	}
}