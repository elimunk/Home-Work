
public class Passenger {

private Suitcase suitcase;
private	int priceOfFlight;
private	int totalFreeKg;
private	int priceForExtraKg;
private boolean isOverFreeKg;

public Passenger(Suitcase suitcase, int priceOfFlight, int totalFreeKg, int priceForExtraKg) {
	this.suitcase=suitcase;
	this.priceOfFlight = priceOfFlight;
	this.totalFreeKg = totalFreeKg;
	this.priceForExtraKg = priceForExtraKg;
}

public int getPriceOfFlight() {
	return priceOfFlight;
}
public void setPriceOfFlight(int priceOfFlight) {
	this.priceOfFlight = priceOfFlight;
}
public int getTotalFreeKg() {
	return totalFreeKg;
}
public void setTotalFreeKg(int totalFreeKg) {
	this.totalFreeKg = totalFreeKg;
}
public int getPriceForExtraKg() {
	return priceForExtraKg;
}
public void setPriceForExtraKg(int priceForExtraKg) {
	this.priceForExtraKg = priceForExtraKg;
}
public Suitcase getSuitcase() {
	return suitcase;
}
public void setSuitcase(Suitcase suitcase) {
	this.suitcase = suitcase;
}

public String toString() {	
	return "--Passenger information--\nPrice Of Flight: "+priceOfFlight+"\nTotal Free Kg: "+
	        totalFreeKg+"\nPrice For Extra Kg: "+priceForExtraKg+"\n" +suitcase.toString(); 
}

public boolean isOverFreeKg() {
	return(suitcase.getWeightOfSuitcase()>totalFreeKg);
}
}
