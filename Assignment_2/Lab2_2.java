import java.util.*;

public class Lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int n = sc.nextInt();
		
		if(n % 400 == 0 || n % 4 == 0) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap Year");
		}
	}

}
