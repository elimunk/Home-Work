import java.util.Random;

public class Passenger extends AirportVisitors {
	Random ran = new Random();

int Passport;	
	
public Passenger(String firstName, String lastName, String gender, int age, String citizenship) {
	super(firstName, lastName, gender, age, citizenship);
	this.Passport =ran.nextInt(99999999- 0000001) + 00000001 ;
}

@Override
public String toString() {
	return   "\n"+ "Passenger:\n" +  super.toString()
			+" , Passport: "+ Passport;
}	
	
	@Override
	public void print() 
		{System.out.println(toString());
		}
	
}
