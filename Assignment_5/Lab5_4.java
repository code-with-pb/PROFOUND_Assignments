class Managr{
	int fixedsal,incentive;
	Managr(int fx,int inc){
		fixedsal = fx;
		incentive = inc;
	}
}
public class Lab5_4 extends Managr{
	int id;
	String dept,nm;
	Lab5_4(int fx,int ic,int id,String de,String nme){
		super(fx,ic);
		this.id = id;
		dept = de;
		nm = nme;
	}
	int sal = 0;
	void ComputeSal() {
		sal = fixedsal + incentive;
		System.out.println(sal);
	}
	public String toString() {
		return id+" "+nm+" "+dept+" "+sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5_4 l = new Lab5_4(80000,10000,101, "Rahul","Akash");
		
		l.ComputeSal();
		
		System.out.println(l.toString());
	}

}
