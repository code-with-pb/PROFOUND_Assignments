
abstract class Instrument{
	public abstract void play();
}
class Piano extends Instrument{
	public void play() {
		System.out.println("Piano is playing tan tan tan");
	}
}
class Flute extends Instrument{
	public void play() {
		System.out.println("Flute is playing toot toot toot");
	}
}
class Guitar extends Instrument{
	public void play() {
		System.out.println("Guitar is playing tin tin tin");
	}
}
public class Lab6_1 {
	public static void main(String args[]) {
		Instrument i[];
		
		i = new Instrument[10];
		
		//i[] = new Instrument(10);
		
		i[0] = new Piano();
		i[0].play();
		
		i[1] = new Flute();
		i[1].play();
		
		i[2] = new Guitar();
		i[2].play();
	}
}
