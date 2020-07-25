package inheritance;

public class Adder 
{
	static double add(double a,double b)
	{
		return a+b;
	}
}

class Test
{
	public static void main(String[]args)
	{
		System.out.println(Adder.add(10, 20));
	}
}