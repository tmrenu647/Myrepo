package aggregation;

public class AggregationChild {
	int rollno;
	String subject;
	AggregationParent refname;
	public AggregationChild(int rollno,String subject,AggregationParent refname)
	{
		this.rollno=rollno;
		this.subject=subject;
		this.refname=refname;
	}
	public void display()
	{
		System.out.println("Rollno="+rollno+" and Subject="+subject);
		System.out.println(refname.age+" "+refname.name);
	}
	public static void main(String[] args) {
		
		AggregationParent object=new AggregationParent(18,"Renu");
		AggregationChild obj=new AggregationChild(01,"English",object);
		obj.display();
		
	}

}
