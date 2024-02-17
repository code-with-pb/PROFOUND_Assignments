
public class Lab4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int id;
	String nm;
	String dob;
	Lab4_1(){
		System.out.println("deafult Constructor ");
	}
	Lab4_1(int id,String nm, String dob){
		this.id = id;
		this.nm = nm;
		this.dob = dob;
	}
	public String toString() {
		return id+" "+nm+" "+dob;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lab4_1 l = new Lab4_1();
		
		Lab4_1 l1 = new Lab4_1(101,"Akash","2000/05/20");
		
		System.out.println(l1.toString());
	}

}
