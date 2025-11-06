package shravyajavaprograms;

public class methodoverloading {
public static void main(String[] args) {
	hello h=new hello();
	h.add(10.4f,9.3f);
	h.add(10,20);
	h.add("virat", "and","kohli");
}                    
}
class hello
{
	void add(int a,int b)
	{
		System.out.println("sum"+(a+b));
	}
	void add(String c,String d,String f)
	{
		System.out.println("string sum="+(c+d+f));
	}
	void add(int g,int h,int i,int j)
	{
		System.out.println("sum"+(g+h+i+j));
	}
	void add(float a,float b)
	{
		System.out.println("float sum="+(a+b));
	}
}