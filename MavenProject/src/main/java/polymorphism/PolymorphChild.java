package polymorphism;

public class PolymorphChild extends PolymorphParent {

	public void sum(int a,int b)
	{
		super.sum(10,10);
		int c=a-b;
		System.out.println("Difference="+c);
	}
	public static void main(String[] args) {

		PolymorphChild obj=new PolymorphChild();
		obj.sum(20,10);

	}

}
