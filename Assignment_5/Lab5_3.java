class salesPerson{
	int commission;
	salesPerson(int cmm){
		commission = cmm;
	}
}
public class Lab5_3 extends salesPerson{
	int id,sal;
	String nm,dept;
	Lab5_3(int c,int idd,int s,String n,String de){
		super(c);
		id = idd;
		sal = s;
		nm = n;
		dept = de;
	}
	public String toString() {
		return id+" "+nm+" "+dept+" "+(sal+commission);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab5_3 l = new Lab5_3(2000,101,50000,"Akash","CSE");
		
		System.out.println(l.toString());
	}

}
