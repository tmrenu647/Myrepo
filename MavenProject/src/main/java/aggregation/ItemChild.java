package aggregation;

public class ItemChild {
	float prod_pric;
	Aggregationproductparent ref;
	ItemChild(float price,Aggregationproductparent ref)
	{
		this.prod_pric=price;
		this.ref=ref;
	}
	public void display()
	{
		System.out.println("Product details");
		System.out.println(prod_pric+" "+ref.prod_id+" "+ref.prod_name+" "+ref.prod_desc);
	}

	public static void main(String[] args) {
	
		Aggregationproductparent obj1=new Aggregationproductparent("TV",10,"Color");
		ItemChild obj2=new ItemChild(2000,obj1);	
		obj2.display();

	}

}
