import java.util.*;

public class Lab4_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abc";
		String s2="abc";
		String s3 = new String("xyz");
		String s4 = new String("xyz");
		
		if(s1 == s2 ) {
			System.out.println("True");
			System.out.println(s3.equals(s4));
		}
		else {
			System.out.println("False");
		}
	}

}
