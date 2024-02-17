import java.util.*;

public class Lab3_5 {
	private static Lab3_5 i;
	private Lab3_5() {}
	public static Lab3_5 getInstance() {
		if(i == null) {
			i = new Lab3_5();
		}
		return i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3_5 l = Lab3_5.getInstance();
		
		System.out.println("Hashcode of l is "+l.hashCode());
	}

}
