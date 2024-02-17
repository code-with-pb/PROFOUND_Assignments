
public class Lab3_6 {
	int empid;
	String empnm;
	double bs,hra,medical=1000,pf,pt,netsal=2000,gs;
	Lab3_6(){
		System.out.println("Emp Data");
	}
	Lab3_6(int empid,double bs){
		this.empid = empid;
		this.bs = bs;
	}
	void cal() {
		hra = bs * 0.5f;
		pt = 200;
		pf = bs * 0.12f;
		gs = bs + medical + netsal + hra - (pt + pf);
	}
	void dis() {
		System.out.println("HRA = "+hra);
		System.out.println("PT = "+pt);
		System.out.println("PF = "+pf);
		System.out.println("Gross Sal = "+gs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab3_6 l = new Lab3_6();
		Lab3_6 l1 = new Lab3_6(101,5000);
		
		l1.cal();
		l1.dis();
		
	}

}
