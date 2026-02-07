package shravyajavaprograms;
//we can prinit a values outside the class 
public class nnn {
public static void main(String[] args) {
	emp e1=new emp();
	
	
	e1.read("anu", 85000, "It");
	e1.dep="HR";
	
	System.out.println(e1.name+"\t"+e1.sal+"\t"+e1.dep);
	
	
}
}
class emp
{
	int sal;
	String name,dep;
	void read(String n,int s,String d)
	{
		name=n;
		sal=s;
		dep=d;
	}
}
