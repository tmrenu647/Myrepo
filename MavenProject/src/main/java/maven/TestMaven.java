package maven;

public class TestMaven {

	public static void main(String[] args) {
		String s="Hello";

		String w="world";

		System.out.println(s+" "+w);

		char a1[]= {'a','b','c','d'};

		String h=new String(a1);

		System.out.println(h);

		String v=new String("test");

		System.out.println(v);

		//Length

		int size=s.length();

		System.out.println(size);

		//charat

		char u=s.charAt(1);

		System.out.println(u);

		//concat - for adding two string

		System.out.println(s.concat(w));

		//contains : to check the value is present or not

		String i="I have a pet";

		System.out.println(i.contains("have"));

		System.out.println(i.contains("an"));

		//compare two

		System.out.println(i.compareTo(s));

		//equals

		String b1="java";

		String a2="selenium";

		String a3="Java";

		String a4="java";

		System.out.println(b1.equals(a4));

		System.out.println(b1.equals(a3));

		System.out.println(b1.equals(a2));

		System.out.println(b1.equalsIgnoreCase(a3));

		//is empty

		String h1="";

		String h2=" ";

		System.out.println(h1.isEmpty());

		System.out.println(h2.isEmpty());

		//to upper case

		String v1="keyboard";

		System.out.println(v1.toUpperCase());

		String v2="MOUSE";

		System.out.println(v2.toLowerCase());
	}

}
