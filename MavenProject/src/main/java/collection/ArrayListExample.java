package collection;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> li=new ArrayList<String>();
		li.add("blue");
		li.add("Red");
		li.add("Green");
		li.add("Yellow");
		System.out.println(li);
		ArrayList<String> col=new ArrayList<String>();
		col.add("Pink");
		col.add("Gray");
		System.out.println(col);
		System.out.println(li.addAll(col));
		System.out.println(li);

	}

}
