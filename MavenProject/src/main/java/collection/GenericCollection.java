package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> li=new ArrayList<String>();
		li.add("blue");
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		System.out.println(li);
		
		li.set(1,"Red");  //set value to an index position
		System.out.println(li);
		li.add("Pink");
		System.out.println(li);
		System.out.println(li.indexOf("Pink"));
		System.out.println(li.lastIndexOf("Pink"));//Repeated element which place occur
		System.out.println(li.remove(1));
		System.out.println(li.get(1));
		System.out.println(li.contains("Red"));
		if(li.isEmpty())
		{
			System.out.println("List is  empty");
		}
		else
		{
			System.out.println("List is not empty");
		}
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i));
		}
		for(String col:li)
		{
			System.out.println(col);
		}
	}

}
