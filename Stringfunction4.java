package module1projects;

public class Stringfunction4 {

	public static void main(String[] args) {
		String a = "Automation Testing";
		String b = "going school";
		boolean b1= a.contains("Automation");
		System.out.println(b1);
		System.out.println(a.substring(4));
		System.out.println(a.substring(2,6));
		//check if string starts with g
		boolean c1 =b.matches("g(.)*");
		System.out.println(c1);
		//check if string starts ends with l
		boolean d1=b.matches("(.)*l");
		System.out.println(d1);
		String url= "https://www.google.com";
		boolean b2= url.matches("https(.*)");
		System.out.println(b2);
		String R= "ram";
		System.out.println(R.replace('r', 'R'));
		String S = "manual testing";
		System.out.println(S.replace("manual", "Automation"));
		
	
	}

}
