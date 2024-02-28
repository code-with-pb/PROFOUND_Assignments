package Exception;
import java.io.*;
import java.util.Scanner;

public class Lab8_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Natural No: ");
		try {
			int s = 0,i=0;
			int n = sc.nextInt();
			while(n > 0) {
				s +=n;;
				n--;
				i++;
			}
			if(n < 0) {
				throw new IllegalArgumentException();
			}
			else {
				s = s/i;
				System.out.println(s);
			}
			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.print();
		}
		
	}

}
