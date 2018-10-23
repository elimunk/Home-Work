
public class Plane implements IFly {


	private String pilotName;
	private String airCompany;
	private String target;
	
public String getPilotName() {
	return pilotName;
}
public void setPilotName(String pilotName) {
	this.pilotName = pilotName;
}
public String getAirCompany() {
	return airCompany;
}
public void setAirCompany(String airCompany) {
	this.airCompany = airCompany;
}
public String getTarget() {
	return target;
}
public void setTarget(String target) {
	this.target = target;
}

@Override
public void fly(int speed) {
	System.out.println("The plane flies "+ speed+" Mph");
}
@Override
public boolean land() {
	System.out.print("the plane has landed: ");
	return true;
}

}