package shravyajavaprograms;

public class abstractmethod {
	public static void main(String[] args) {
		   dog1 a=new dog1();
		   
		   a.greet();
		   a.eat();
		   a.sound();
		}
		}
abstract class animal2
		{
			void greet()
			{
				System.out.println("HII");
			}
			abstract void eat();
			abstract void sound();
}
class dog1 extends animal2
{
	void eat()
	{
		System.out.println("dog eat pedgree");
	}
	void sound()
	{
		System.out.println("dog sounds bark");
	}
}