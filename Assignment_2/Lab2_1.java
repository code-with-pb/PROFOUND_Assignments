import java.util.*;

public class Lab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Person Age: ");
		int n = sc.nextInt();
		if(n >= 18) {
			System.out.println("Person is Eligible for Vote: ");
		}
		else {
			System.out.println("Person is Not Eligible for Vote: ");
		}
	}

}
