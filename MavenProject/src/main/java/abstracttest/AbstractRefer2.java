package abstracttest;

public class AbstractRefer2 extends AbstractRefer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractRefer1 obj=new AbstractRefer2(); //create reference
		obj.display();
		obj.print2();
		//obj.print1(); obj created as reference
	
		

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Reference");
		
	}
	public void print1()
	{
		System.out.println("Instance refer1");
	}

}
