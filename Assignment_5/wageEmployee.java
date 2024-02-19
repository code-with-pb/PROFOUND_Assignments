

public class Emp1 {
	int sal;
	Emp1(int sal){
		this.sal = sal;
	}
}



public class wageEmployee extends Emp1{
	int hr,rate;
	wageEmployee(int s,int h,int r){
		super(s);
		hr = h;
		rate = r;
	}
	void computeSalary(){
		sal += hr * rate;
		System.out.println(sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		wageEmployee wg = new wageEmployee(2000,8,800);
		wg.computeSalary();
	}

}
