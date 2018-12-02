
public class Tag implements Runnable {

	private String classTag;
	
	 
	public Tag(String classTag) {
		this.classTag = classTag;
	}



	public void run (){
		
		for (int i = 0; i < 4; i++) {
			System.out.println(classTag);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}System.out.println("222");
	}
	
}
