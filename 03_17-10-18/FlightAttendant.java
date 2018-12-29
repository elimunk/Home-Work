
public class FlightAttendant extends AirportVisitors {

	String originCountry;
	String Class;
	
	public FlightAttendant(String firstName, String lastName, String gender, int age, String citizenship,
			String originCountry, String class1) {
		super(firstName, lastName, gender, age, citizenship);
		this.originCountry = originCountry;
		this.Class = class1;
	}
	

@Override
public String toString() {
	return  "\n"+ "Flight Attendants:\n" + super.toString()+
			" , Origin Country: " + originCountry +
			" , Class: " + Class ;
	
}

	@Override
	public void print() {
		{System.out.println(toString());
		}
	}

}
