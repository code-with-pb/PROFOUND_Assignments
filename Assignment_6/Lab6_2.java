import java.util.Scanner;

abstract class Medicine{
	String tsk,nm,addr;
	Medicine(String task,String name,String Add){
		tsk = task;
		nm = name;
		addr = Add;
	}
	public abstract void displayLable();
	public void dis() {
		System.out.println(nm+" "+addr);
	}
}
class Table extends Medicine{
	Table(String task,String name,String Add){
		super(task,name,Add);
	}
	@Override
	public void displayLable() {
		super.dis();
		// TODO Auto-generated method stub
		System.out.println("Store in cool dry place");
	}
}
class Ointment extends Medicine{
	Ointment(String task,String name,String Add){
		super(task,name,Add);
	}
	@Override
	public void displayLable() {
		// TODO Auto-generated method stub
		super.dis();
		System.out.println("For external use only");
	}
}
class Syrup extends Medicine{
	Syrup(String task,String name,String Add){
		super(task,name,Add);
	}
	@Override
	public void displayLable() {
		// TODO Auto-generated method stub
		super.dis();
		System.out.println("For Health Purpose");
	}
}
public class Lab6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medicine a[];
		
		a = new Medicine[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Chice: ");
		
		int n = sc.nextInt();
		
		switch(n) {
		case 1: a[0] = new Table("Drug Manufacture","Pharmaceutical","Butte Patil Complex Poud Phata");
				a[0].displayLable();break;
		case 2: a[1] = new Ointment("Drug Manufacture","Pharmaceutical","Butte Patil Complex Poud Phata");
				a[1].displayLable();break;
		case 3: a[2] = new Syrup("Drug Manufacture","Pharmaceutical","Butte Patil Complex Poud Phata");
				a[2].displayLable();break;
		}
		
		/*a[0] = new Table("Drug Manufacture","Pharmaceutical","Butte Patil Complex Poud Phata");
		a[0].displayLable();
		
		a[1] = new Ointment("Drug Manufacture","Pharmaceutical","Butte Patil Complex Poud Phata");
		a[1].displayLable();
		
		a[2] = new Syrup("Drug Manufacture","Pharmaceutical","Butte Patil Complex Poud Phata");
		a[2].displayLable();*/
	}

}
