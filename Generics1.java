package practice;

interface base<t>
{
	void print(t x);
}

class derived<t> implements base<t>
{
	public void print(t x)
	{
		System.out.println(x);
	}
}

public class Generics1 
{
	public static void main(String args[])
	{
		derived d=new derived();
		d.print(45);
		d.print(39.849);
		d.print('A');
		d.print("Demo test");
	}
}
