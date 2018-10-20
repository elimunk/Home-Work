package cinema;

public class Seats {

	private double price;
	private boolean isSeatTaken= false;
	private int row, col;

public void takeSeat(){
	this.isSeatTaken=true;
	System.out.println("Its' ordered! ");
	}


public Seats() {
	super();
	this.price = Math.random()* 20 + 70 ;
	this.isSeatTaken = false;
}


public void setPrice(double price) {
	this.price = price;
}

public double getPrice() {
	return price;
}


public boolean isSeatTaken(){

	return isSeatTaken;
}


public int getRow() {
	return row;
}


public void setRowAndCol(int row, int col) {
	this.row = row;
	this.col = col;
}


public int getCol() {
	return col;
}


}
