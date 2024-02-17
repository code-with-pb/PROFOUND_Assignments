import java.util.*;

public class Lab4_3 {
	String s,b;
	void get() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		s = sc.nextLine();
		System.out.print("Enter String: ");
		b = sc.nextLine();
	}
	void Op() {
		System.out.println(s.length());
		System.out.println();
		System.out.println(s.hashCode());
		System.out.println();
		System.out.println(s.equals(b));
		System.out.println();
		System.out.println(s.replace(s, b));
		System.out.println();
		System.out.println(s.trim());
		System.out.println();
		System.out.println(s.substring(2));
		System.out.println();
		System.out.println(s.concat(b));
		System.out.println();
		System.out.println(s.compareTo(b));
		System.out.println();
		System.out.println(s.charAt(3));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_3 l = new Lab4_3();
		
		l.get();
		l.Op();
		
	}

}
