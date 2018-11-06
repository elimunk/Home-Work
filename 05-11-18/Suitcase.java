import java.util.ArrayList;

public class Suitcase {

	private ArrayList <Product> productInSuitcase ;
	private double WeightOfSuitcase;
	
	public Suitcase() {
		productInSuitcase = new ArrayList<Product>();
	}
	
	public ArrayList<Product> getProductInSuitcase() {
		return productInSuitcase;
	}
	
	public void addProductInSuitcase(Product product) {
		productInSuitcase.add(product);	
	}
	
	public double getWeightOfSuitcase() {
		WeightOfSuitcase=0;
		for(Product p : productInSuitcase) {
		
			WeightOfSuitcase+=p.getWeight();
			
		}return WeightOfSuitcase ;
	}

public String toString() {
	String str="";
	for(int i=0; i < productInSuitcase.size(); i++) {
		str+=i+1 +". "+ productInSuitcase.get(i).getNameOfPruduct()+ ", Weight: "+productInSuitcase.get(i).getWeight()+"\n";
	}
	return "\nSuitcase data:\n"+str;
}


}
