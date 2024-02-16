import java.util.*;

public class Lab2_6 {
	
	static int fib(int n) {
		if(n <= 1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int n = sc.nextInt();
		
		int a = 0,b = 1,c , i;
		
		/*if(n == 0) {
			System.out.println(a);
		}
		for(i=2;i<=n;i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.print(b+" ");
		}
		System.out.println(b);*/
		for(i=1;i<=n;i++){
			System.out.print(a+" ");
			
			int s = a + b;
			a = b;
			b = s;
		}
	}

}
