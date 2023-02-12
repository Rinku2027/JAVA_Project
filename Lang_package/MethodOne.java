package Lang_package;

public class MethodOne {

	public static void methodOne(int i)
	{
	System.out.println("general method");
	}
	public static void methodOne(int... i)
	{
	System.out.println("var-arg method");
	}
	public static void main(String[] args)
	{
	methodOne();//var-arg method
	methodOne(10,20);//var-arg method
	methodOne(10);//general method
	}
	}
