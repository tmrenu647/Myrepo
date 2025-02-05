         package abstracttest;

public class AbstratcSubClass extends Abstract1 {
	
	public void start()
	{
		System.out.println("Start");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstratcSubClass obj=new AbstratcSubClass();
		obj.display();  
		obj.print();
		obj.start();

	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("This is an Abstrat class");
		
	}

}
