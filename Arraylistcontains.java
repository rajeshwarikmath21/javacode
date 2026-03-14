package collection;

import java.util.ArrayList;

public class Arraylistcontains {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Automation");
		a1.add("Test");
		a1.add("Engineer");
		a1.add("Maven");
		System.out.println(a1);
		boolean b2=a1.contains("Engineer");
		System.out.println(b2);
		ArrayList<String> a2= new ArrayList<String>();
		a2.addAll(a1);
		System.out.println(a2);
		boolean b1= a2.containsAll(a1);
		System.out.println(b1);
		
		
		
		
		
	}

}
