
public class CLA7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		for(int i=0;i<5;i++) {
			a[i] = Integer.parseInt(args[i]);
		}
		int s = 0;
		for(int i=0;i<5;i++) {
			s += a[i];
		}
		System.out.println("sum of given Array is: "+s);
	}

}
