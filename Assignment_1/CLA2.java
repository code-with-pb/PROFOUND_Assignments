
public class CLA2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		
		System.out.println("\n1]+\n2]-\n3]*\n4]/");
		
		int n = Integer.parseInt(args[2]);
		float s = 0;
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
