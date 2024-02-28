package Exception;
import java.io.*;

public class Lab8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;
		String s = " ";
		String nl = " ";
		try {
			System.out.print("Enter name: ");
			s = br.readLine();
			System.out.print("Enter age: ");
			a = Integer.parseInt(br.readLine());
			System.out.print("Enter Nationality: ");
			nl = br.readLine();
		}catch(Exception e) {
			e.printStackTrace();
		}
		Voter v = new Voter(a,s,nl);
		
		v.check(s, a);
		System.out.println();
		System.out.println(v.toString());
	}

}
