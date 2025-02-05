package Super;

public class SuperInstanceChild extends SuperInstanceParent {
	
	String color="Green";
	public void display()
	{
		System.out.println(color);
		System.out.println(super.color);
	}

	public static void main(String[] args) {
		
		SuperInstanceChild obj=new SuperInstanceChild();
		obj.display();
	}

}
