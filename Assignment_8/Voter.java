package Exception;

public class Voter {
	int age;
	String nm,nl;
	Voter(int ag,String nmm,String nll){
		age = ag;
		nm = nmm;
		nl = nll;
	}
	public String toString() {
		return nm+" "+age+" "+nl;
	}
	public void check(String nm,int age) {
		try {
			String s1 = "Ind";
			if(!nl.equals(s1) && age > 17) {
				throw new IncorrectNationalityException("IncorrectNationalityException");
			}
			else if(nl.equals(s1) && age < 18) {
				throw new IncorrectAgeException("IncorrectAgeException");		
			}else if(!nl.equals(s1) && age < 18){
				throw new IncorrectDataException("IncorrectNationalityException IncorrectAgeException");
			}else {
				System.out.println("Eligible for voting...");
			}
			//}else {
			//	throw new IncorrectNationalityException();
			//}
		//}catch(IncorrectNationalityException | IncorrectAgeException e) {
			//e.print();
		}catch(IncorrectNationalityException | IncorrectAgeException | IncorrectDataException e) {
			System.out.println(e.getMessage());
		}
	}
}
