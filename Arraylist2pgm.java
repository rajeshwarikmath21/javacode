package collection;

import java.util.ArrayList;

public class Arraylist2pgm {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Gowthami");
		a1.add("Priya");
		a1.add("Rajeshwari");
		a1.add(2, "Raje");// it will add object at index 2
		System.out.println(a1);
		
		ArrayList<String> a2= new ArrayList<String>();
		a2.add("Sayli");
		//a2.addAll(a1);// here a1 and a2 are collection, we are using it for addall collection method.
		a2.addAll(0, a1);
		System.out.println(a2);
		
	}

}
