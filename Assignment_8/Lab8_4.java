package Exception;
import java.io.*;

public class Lab8_4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccForUserDefinedException a = new AccForUserDefinedException(10000);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			System.out.print("Enter Amoutn You want to withdrawl: ");
			n = Integer.parseInt(br.readLine());
		}catch(Exception e) {
			e.printStackTrace();
		}
		a.withdraw(n);
	}

}
