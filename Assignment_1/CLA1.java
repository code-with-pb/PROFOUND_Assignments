
public class CLA1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		
		System.out.println("\n1]+\n2]-\n3]*\n4]/");
		
		int n = Integer.parseInt(args[2]);
		int s = 0;
		switch(n) {
		case 1: s = a+b;
		System.out.println(s);
		break;
		case 2: s = a-b;
		System.out.println(s);
		break;
		case 3: s = a* b;
		System.out.println(s);
		break;
		case 4: s = a / b;
		System.out.println(s);
		break;
		}
	}

}
