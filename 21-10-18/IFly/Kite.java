
public class Kite implements IFly{
	private	String color;
	private	int price;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = (price>0) ?price :0 ;
	}
	
	@Override
	public void fly(int speed) {
		System.out.println("The kite flies at "+ speed+" Mph");
	}
	@Override
	public boolean land() {
		System.out.print("The kite are landed: ");
		return false;
	}

}
