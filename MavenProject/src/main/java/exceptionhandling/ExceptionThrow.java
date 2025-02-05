package exceptionhandling;

public class ExceptionThrow {

	public static void main(String[] args) {
		int age=15;
		if (age>=18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			throw new ArithmeticException("Not eligible");
		}
		
	}

}
