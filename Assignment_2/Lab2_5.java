import java.util.*;

public class Lab2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int n = sc.nextInt();
		
		int t = n;
		int s = 0;
		while(t !=0) {
			int r = t % 10;
			s = s * 10 + r;
			t /=10;
		}
		System.out.println("Reverse No of Given No is: "+s);
	}

}
