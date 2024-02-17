import java.util.*;

public class Lab4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "This is a-String-with-blank-space-and-hyphens";
		
		String splited[] = s.split("\\s+|\\-");
		
		for(String t : splited) {
			System.out.println(t);
		}
	}

}
