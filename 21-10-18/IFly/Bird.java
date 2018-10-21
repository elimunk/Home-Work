
public class Bird implements IFly{
	private String type;
	private int age;
	private String color;

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public void fly(int speed) {
		System.out.println("The bird flies "+ speed+" Mph");
	}
	@Override
	public boolean land() {
		System.out.print("The bird are landed: ");
		return false ;
		
	 
	}
	
}
