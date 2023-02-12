package Lang_package;

public class StaticVar {
	static int i=10;
	public static void main(String[] args) 
	{
		StaticVar t=new StaticVar();
	System.out.println(t.i);//10
	System.out.println(StaticVar.i);//10
	System.out.println(i);//10
	}
	}
