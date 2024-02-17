import java.util.*;

public class Lab4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int n = Integer.parseInt(sc.nextLine());
		
		String s = Integer.toBinaryString(n);
		System.out.println(s);
		
		String s1 = Integer.toHexString(n);
		System.out.println(s1);
		
		String s2 = Integer.toOctalString(n);
		System.out.println(s2);
		
	}

}
