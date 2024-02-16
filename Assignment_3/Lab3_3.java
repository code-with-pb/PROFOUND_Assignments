import java.util.*;

public class Lab3_3 {
	void cal(int a[],int b[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Choice: ");
		int n = sc.nextInt();
		
		int c[] = new int[5];
		
		switch(n) {
		case 1: for(int i=0;i<5;i++) {
					c[i] = a[i] + b[i];
				}
				for(int i=0;i<5;i++) {
					System.out.print(c[i]+" ");
				}break;
		case 2: for(int i=0;i<5;i++) {
					c[i] = a[i] - b[i];
				}
				for(int i=0;i<5;i++) {
					System.out.print(c[i]+" ");
				}break;
		case 3: for(int i=0;i<5;i++) {
					c[i] = a[i] * b[i];
				}
				for(int i=0;i<5;i++) {
					System.out.print(c[i]+" ");
				}break;
		case 4: for(int i=0;i<5;i++) {
					c[i] = a[i] / b[i];
				}
				for(int i=0;i<5;i++) {
					System.out.print(c[i]+" ");
				}
				break;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int b[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array1 Element: ");
		for(int i=0;i<5;i++) {
			a[i] = sc.nextInt();
		}
		System.out.print("Enter Array2 Element: ");
		for(int i=0;i<5;i++) {
			b[i] = sc.nextInt();
		}
		Lab3_3 l = new Lab3_3();
		
		l.cal(a, b);
	}

}
