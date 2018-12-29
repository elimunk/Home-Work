
public class App {

	public static void main(String[] args) {

		Tag tag1 = new Tag("Tag<1>");
		Tag tag2 = new Tag("Tag<2>");
		Tag tag3 = new Tag("Tag<3>");
		Tag tag4 = new Tag("Tag<4>");
		
		Thread t1 = new Thread(tag1);
		Thread t2 = new Thread(tag2);
		Thread t3 = new Thread(tag3);
		Thread t4 = new Thread(tag4);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
				
	}

}
