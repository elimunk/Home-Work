
public class Cinema {
	
	private double price;
	private boolean isSeatTaken= false;

public void takeSeat(){
	this.isSeatTaken=true;
	}


public Cinema() {
	super();
	this.price = Math.random();
	this.isSeatTaken = false;
}


public void setPrice(double price) {
	this.price = price;
}


public boolean isSeatTaken(){

	return isSeatTaken;
}
	
	
}
