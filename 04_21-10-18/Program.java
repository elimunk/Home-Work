import java.util.Random;

public class Program {

	public static IFly createIFly() {
		Random ran = new Random();
		int num = ran.nextInt(3 - 0) + 0;
		if (num == 0) {
			Bird bird = new Bird();
			return bird;
		} else if (num == 1) {
			Plane plane = new Plane();
			return plane;
		} else {
			Kite kite = new Kite();
			return kite;
		}
	}

	public static void main(String[] args) {
		Random ran = new Random();

		IFly[] iflyArray = new IFly[10];

		for (int i = 0; i < iflyArray.length; i++) {
			System.out.println(i + 1 + ". ");             /* >>---------- create index number -----------*/
			iflyArray[i] = createIFly();                  /* >>----- create random object by method -----*/
			iflyArray[i].fly(ran.nextInt(51 - 1) + 1);    /* >>--- create random speed for each object---*/
			System.out.println(iflyArray[i].land());      /* >>- call the land method for each object----*/
			                         
		}

	}

}
