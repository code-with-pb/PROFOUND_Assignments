
public class Lab4_2 {
	int id,sal;
	String nm,dep;
	Lab4_2(int id,int sal,String nm,String dep){
		this.id = id;
		this.sal = sal;
		this.nm = nm;
		this.dep = dep;
	}
	void dis() {
		System.out.println(id+" "+nm+" "+dep+" "+sal);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_2 l[];
		l = new Lab4_2[5];
		
		l[0] = new Lab4_2(101,40000,"Akash","CSE");
		
		l[0].dis();
		
		l[1] = new Lab4_2(102,400000,"Hrishikesh","CE");
		
		l[1].dis();
		
		l[2] = new Lab4_2(103,50000,"Pawan","Mech");
		
		l[2].dis();
		
		l[3] = new Lab4_2(104,500000,"Rahul","BCA");
		
		l[3].dis();
		
		l[4] = new Lab4_2(105,504000,"Aditya","E&Tc");
		
		l[4].dis();
		
	}

}
