package Super;

public class SuperMethodChild extends SuperMethodParent {
	public void print()
	{
		System.out.println("This is a child class");
		super.display();
	}
	

	public static void main(String[] args) {
		
		SuperMethodChild obj=new SuperMethodChild();
		obj.print();
		

	}

}
