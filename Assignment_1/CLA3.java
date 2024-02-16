
public class CLA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float bs;
		float da,hra,gs;
		int t;
		
		bs = Float.parseFloat(args[0]);
		
		da = bs * 0.2f;
		hra = bs = 0.3f;
		gs = bs + da + hra;
		
		System.out.println("basic Salary = "+bs);
		System.out.println("bs of da = "+da);
		System.out.println("hra of bs = +hra");
		
		if(bs>0 && bs < 4000) {
			t = 4;
			System.out.println("It = "+t+"%");
		}
		else if(bs>=4000 && bs < 10000) {
			t = 6;
			System.out.println("It = "+t+"%");
		}
		else if(bs >= 10000 && bs < 17000) {
			t = 8;
			System.out.println("It = "+t+"%");
		}
		else if(bs >= 17000 && bs < 27000) {
			t = 10;
			System.out.println("It = "+t+"%");
		}
		else {
			t = 15;
			System.out.println("It = "+t+"%");
		}
	}

}
