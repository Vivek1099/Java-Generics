package practice;

//Implementation of generics using interface.

interface base<t> //generics type interface
{
	void print(t x);
}

class derived<t> implements base<t> //implementation of generics
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
		//passing of arguements.
		derived d=new derived();
		d.print(45);
		d.print(39.849);
		d.print('A');
		d.print("Demo test");
	}
}
