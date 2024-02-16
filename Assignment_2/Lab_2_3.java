import java.util.*;

public class Lab_2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int n = sc.nextInt();
		
		int t = n;
		
		/*while(n != 0) {
			int r = n % 10;
			t = r;
			n /=10;
		}*/
		int s = 1;
		for(int i=1;i<=t;i++) {
			s *= i;
		}
		System.out.println("Factorial of given No is: "+s);
	}

}
