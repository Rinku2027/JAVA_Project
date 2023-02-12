package Lang_package;

public class Array_Variable_Exmple {

	int i=10;
	public static void main(String[] args) 
	{
	//System.out.println(i);
	//C.E:non-static variable i cannot be referenced from a static 
		Array_Variable_Exmple t=new Array_Variable_Exmple();
	System.out.println(t.i);//10(valid)
	t.methodOne();
	}
	public void methodOne()
	{
	System.out.println(i);//10(valid)
	}
	}

