import com.user.*;

public class Lab7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Greeter g = new Greeter("Akash");
		
		System.out.println(g.sayHello());
		
		String s[] = {"Never say No","Good Luck","Communication Matter"};
		
		Advisor a = new Advisor(s);
		
		System.out.println(a.getAdvice());
		
		System.out.println(g.sayGoodBye());
	}

}
