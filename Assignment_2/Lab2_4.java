import java.util.*;

public class Lab2_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int n = sc.nextInt();
		
		int t = n;
		
		int s = 0;
		while(t != 0) {
			int r = t % 10;
			s +=(r*r*r);
			t /=10;
		}
		if(s == n) {
			System.out.println("ArmStrong No: ");
		}
		else {
			System.out.println("Not ArmStrong No: ");
		}
	}

}
