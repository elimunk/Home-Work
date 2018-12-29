import java.util.Random;

public class Pilot extends AirportVisitors {
	
	Random ran = new Random();

	int aircraftLicense;
	int seniority;
	
	public Pilot(String firstName, String lastName, String gender, int age, String citizenship,
			 int seniority) {
		super(firstName, lastName, gender, age, citizenship);
		this.aircraftLicense =ran.nextInt(999999- 00001) + 000001;
		this.seniority = seniority;
	}
	

@Override
public String toString() {
	return  "\n"+ "Pilot: \n" + super.toString()
	+ " , AircraftLicense: " + aircraftLicense + " , Seniority: " + seniority;
}
  

@Override
public void print() 
	{System.out.println(toString());
	}

	
}
