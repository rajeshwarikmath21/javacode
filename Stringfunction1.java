package module1projects;

public class Stringfunction1 {

	public static void main(String[] args) {
		String a  = "Rajeshwari";
		String b="     Raju Hiremath    ";
		String c= "AUTOMATION";
		String d = "automation";
		//System.out.println(b);
		//System.out.println(a.concat(" Raju Hiremath"));
		
		
		System.out.println(b.trim());
		int count = a.length();
		System.out.println(count);
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		boolean b1= c.equals (d);
		boolean b2= c.equalsIgnoreCase(d);
		System.out.println(b1);
		System.out.println(b2);
		
		
		
		

	}

}
