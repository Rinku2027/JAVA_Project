package Lang_package;

public class Static_2 {
	int x=10;
	static int y=20;
	public static void main(String[] args) 
	{
		Static_2 t1=new Static_2();
	t1.x=888;
	t1.y=999;
	Static_2 t2=new Static_2();
	System.out.println(t2.x+"----"+t2.y);//10----999
	}
	}
