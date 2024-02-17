import java.time.*;

public class Lab4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld = LocalDate.of(2000, 12, 22);
		
		DayOfWeek dw = DayOfWeek.from(ld);
		
		int v = dw.getValue();
		
		System.out.println("("+dw.getValue()+")"+" "+dw.name());
	}

}
