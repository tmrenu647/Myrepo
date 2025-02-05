package Super;

public class SuperConstructorChild extends SuperConstructorParent {
	public SuperConstructorChild()
	{
		super(10,11);
		System.out.println("Welcome");
	}

	public SuperConstructorChild(int d,int e)
	{
		super(10,12,10);
		System.out.println(d);
		System.out.println(e);
	}
	public static void main(String[] args) {
		SuperConstructorChild obj=new SuperConstructorChild();
		SuperConstructorChild obj1=new SuperConstructorChild(10,12);
		

	}

}
