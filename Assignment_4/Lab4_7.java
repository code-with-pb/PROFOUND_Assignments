
public class Lab4_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "14abc9kj";
		int n = s.length();
		int t = 0;
		for(int i=0;i<n;i++) {
			if(Character.isDigit(s.charAt(i))) {
				String tmp = s.substring(i, i+1);
				t += Integer.parseInt(tmp);
			}
		}
		System.out.println(t);
	}

}
