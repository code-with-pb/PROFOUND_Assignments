interface relational{
	void greaterThan();
	void lessThan();
	void greaterThaneq();
	void lssThaneq();
}
class impRel implements relational{
	int a,b;
	impRel(int a,int b){
		this.a = a;
		this.b = b;
	}
	@Override
	public void greaterThan() {
		// TODO Auto-generated method stub
		System.out.println(a+" > "+ b);
	}
	@Override
	public void lessThan() {
		// TODO Auto-generated method stub
		System.out.println(a+" < "+ b);
	}
	@Override
	public void greaterThaneq() {
		// TODO Auto-generated method stub
		System.out.println(a+" >= "+ b);
	}
	@Override
	public void lssThaneq() {
		// TODO Auto-generated method stub
		System.out.println(a+" <= "+ b);
	}
}
public class Lab7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		relational r;
		
		r = new impRel(10,20);
		
		r.greaterThan();
		r.lessThan();
		r.greaterThaneq();
		r.lssThaneq();
	}

}
