package accessspecifier;

public class AccessSpecifierTest {
	private void privateMethod()
	{
		System.out.println("This is a private method");
	}
	public void publicMethod()
	{
		System.out.println("This is a public method");
	}
	protected void protectedMethod()
	{
		System.out.println("This is a protected method");
	}
	 void defaultMethod()
		{
			System.out.println("This is a default method");
		}

	

	public static void main(String[] args) {
		
		AccessSpecifierTest obj=new AccessSpecifierTest();
		obj.privateMethod();
		obj.protectedMethod();
		obj.publicMethod();
		obj.AccessSpecifierTest();

	}

}
