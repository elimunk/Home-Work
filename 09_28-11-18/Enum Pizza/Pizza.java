
public class Pizza {

	Topping topping;
	Size size;
	private double price;
	
	public Pizza(Topping topping, Size size, double price) {
		super();
		this.topping = topping;
		this.size = size;
		this.price = price;
	}
	
	
	
	public Topping getTopping() {
		return topping;
	}



	public void setTopping(Topping topping) {
		this.topping = topping;
	}



	public Size getSize() {
		return size;
	}



	public void setSize(Size size) {
		this.size = size;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
return "Pizza size: "+ getSize()+ " With "+ getTopping()+" The price is: "+getPrice();
		
	}
	
}
