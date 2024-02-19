import java.util.Scanner;

abstract class Shape{
	float area;
	public abstract void area();
}
class circle extends Shape{
	int r;
	circle(int rr){
		r = rr;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = r * r * 3.14f;
		System.out.println("Area of Circle: "+area);
	}
}
class cylinder extends Shape{
	int r,h;
	cylinder(int rr,int hh){
		r = rr;
		h = hh;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area  = 2 * 3.14f * r * h + 2 * 3.14f * r * r; 
		System.out.println("Area of Cylinder: "+area);
	}
}
class square extends Shape{
	int a;
	square(int n){
		a = n;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = a * a;
		System.out.println("Area of Square: "+area);
	}
	
}
class rectangle extends Shape{
	int l,b;
	rectangle(int ll,int bb){
		l = ll;
		b = bb;
	}
	@Override
	public void area() {
		// TODO Auto-generated method stub
		area = l * b;
		System.out.println("Area of Rectangle: "+area);
	}
}
public class Lab6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s[];
		
		s = new Shape[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Chice: ");
		
		int n = sc.nextInt();
		
		switch(n) {
		case 1: s[0] = new circle(4);
				s[0].area();break;
		case 2: s[1] = new cylinder(4,8);
				s[1].area();break;
		case 3: s[2] = new square(4);
				s[2].area();break;
		case 4: s[3] = new rectangle(8,4);
				s[3].area();break;
		}
	}

}
