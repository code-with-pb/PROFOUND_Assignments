import java.util.Scanner;

interface MyMath{
	double sqr(double a);
	double cube(double a);
	double cosine(double a);
	double sine(double a);
}
class impMath implements MyMath{

	@Override
	public double sqr(double a) {
		// TODO Auto-generated method stub
		return a*a;
	}

	@Override
	public double cube(double a) {
		// TODO Auto-generated method stub
		return a*a*a;
	}

	@Override
	public double cosine(double a) {
		// TODO Auto-generated method stub
		return Math.cos(a);
	}

	@Override
	public double sine(double a) {
		// TODO Auto-generated method stub
		return Math.sin(a);
	}
	
}
public class Lab7_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMath m;
		
		m = new impMath();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No: ");
		int a = sc.nextInt();
		
		System.out.println(m.sqr(a));
		
		System.out.println(m.cube(a));
		
		System.out.println(m.cosine(a));
		
		System.out.println(m.sine(a));
	}

}
