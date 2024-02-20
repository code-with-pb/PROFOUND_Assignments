package Pack1;

public class Student {
	int std_roll,std_fees;
	String nm,dept,school_nm;
	public Student(int st,String nme,String de,String sh_nm,int st_fee){
		std_roll = st;
		nm = nme;
		dept = de;
		school_nm = sh_nm;
		std_fees = st_fee;
	}
	public void dis() {
		System.out.println(std_roll+" "+nm+" "+dept+" "+school_nm+" "+std_fees);
	}
}
