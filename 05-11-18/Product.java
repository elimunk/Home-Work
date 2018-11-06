
public class Product {
	
private double weight;
private String nameOfPruduct;

public Product() {
}

public Product(double weight, String nameOfPruduct) {
	setWeight(weight);
	setNameOfPruduct(nameOfPruduct);
	}

public Product( String nameOfPruduct) {
	setWeight((int)(Math.random()*15+1));
	setNameOfPruduct(nameOfPruduct);
	}

public double getWeight() {
	return weight;
}

public void setWeight(double weight) {
	this.weight = (weight>0) ? weight : 0 ;
}

public String getNameOfPruduct() {
	return nameOfPruduct;
}

public void setNameOfPruduct(String nameOfPruduct) {
	this.nameOfPruduct = nameOfPruduct;
}

public void setNameAndWeightOfPruduct(String nameOfPruduct,double weight ) {
	this.nameOfPruduct = nameOfPruduct;
	this.weight = (weight>0) ? weight : 0 ;
}
	
	
}
