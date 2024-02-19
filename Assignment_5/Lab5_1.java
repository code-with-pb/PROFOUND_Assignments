class ame{
	ame(){
		System.out.println("Game Class");
	}
}
class boardgame extends ame{
	boardgame(){
		System.out.println("Board Game Class");
	}
}
class chess extends boardgame{
	chess(){
		System.out.println("Chess Game Class");
	}
}
public class Lab5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chess c = new chess();
		
	}

}
