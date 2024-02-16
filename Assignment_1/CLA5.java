
public class CLA5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = Integer.parseInt(args[0]);
		int t = a;
		int s = 0;
		while(t != 0) {
			int r = t % 10;
			s += r;
			t /=10; 
		}
		System.out.println("sum of given tree digit is: "+s);
	}
}
