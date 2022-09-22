
public class BasicCalculator

{

	public BasicCalculator()
	{
		System.out.println("Default Constructor");	
	}
	
	public static void add()
	{
		System.out.println("A+B");
	}
	
	public static void sub()
	{	
		System.out.println("A-B");
	}
	
	public static void mul()
	{
		System.out.println("A*B");
	}
	
	public static void div()
	{
		System.out.println("A/B");
	}
	
	public static void main(String[] args)
	{ 
		/*BasicCalculator test = new BasicCalculator();
		test.add();
		test.sub();
		test.mul();
		test.div();*/
		
		BasicCalculator test = new BasicCalculator();
		
		BasicCalculator.add();
		BasicCalculator.sub();
		BasicCalculator.mul();
		BasicCalculator.div();

	}

}