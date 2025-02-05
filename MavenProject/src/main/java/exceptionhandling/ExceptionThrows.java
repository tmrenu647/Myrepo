package exceptionhandling;

public class ExceptionThrows {
	
	public static void display() throws ArithmeticException
	{
		System.out.println("Display method");
		throw new ArithmeticException("Throwing Arithmetic Exception");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			display();
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception Handling");
		}  


	}

}
