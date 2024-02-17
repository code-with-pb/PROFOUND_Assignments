import java.util.*;
import java.io.*;

public class Lab4_4 {
	void practice() {
		StringBuffer sb = new StringBuffer("Hello ");
		System.out.println();
		System.out.print(sb.length());
		System.out.println();
		System.out.print(sb.capacity());
		System.out.println();
		System.out.print(sb.insert(6, "Java"));
		System.out.println();
		System.out.print(sb.delete(1,3));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_4 l = new Lab4_4();
		
		l.practice();
	}

}
