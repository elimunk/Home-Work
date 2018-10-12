package pizza;

public class Pizza {
	
 private double diameter;
 private int slices, toppings;
 
public Pizza(double diameter, int slices, int toppings) {
	super();
	 if (diameter >=10 &&diameter <=50 ) {
		 this.diameter = diameter ;	 }
	 if (slices >=1 &&slices <=8 ) {
	this.slices = slices ;  }
	 if (toppings >=0 &&toppings <=50 ) {
	this.toppings = toppings ;  }
}
	 
public double getDiameter() {
	return diameter;
}
public void setDiameter(double diameter) {
	this.diameter = diameter;
}
public int getSlices() {
	return slices;
}
public void setSlices(int slices) {
	this.slices = slices;
}
public int getToppings() {
	return toppings;
}
public void setToppings(int toppings) {
	this.toppings = toppings;
}
 
 public boolean isBasicPizza() {
	 return  (toppings==0) ? true : false ;
 }
	
 public String toString() {
	return "The pizza diameter is: "+ getDiameter() 
	 + ", The number of slices are: " + getSlices() 
	 + ", The amount of toppings is: " + getToppings();
 }
	
}
