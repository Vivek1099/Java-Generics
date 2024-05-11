package practice;

class Printer<T>
{
	T x;
	Printer(T x)
	{
		this.x = x;
	}
	
	void print()
	{
		System.out.println(x);
	}
}


public class Generics 
{
	public static void main(String args[])
	{
		Printer<Integer> p = new Printer<>(23);
		p.print();
		
		Printer<Double> p1 = new Printer<>(44.89);
		p1.print();
		
		Printer<Character> p2 = new Printer<>('B');
		p2.print();
		
		Printer<String> p3=new Printer<>("My name is Vivek");
		p3.print();
	}
}
