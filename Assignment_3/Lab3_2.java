
public class Lab3_2 {
	void add(int... a) {
		System.out.println(a.length);
		
		for(int i : a) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3_2 l = new Lab3_2();
		
		l.add(100);
	}

}
