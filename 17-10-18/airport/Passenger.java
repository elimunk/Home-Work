import java.util.Random;

public class Passenger extends AirportVisitors {
	Random ran = new Random();

int Passowrd;	
	
public Passenger(String firstName, String lastName, String gender, int age, String citizenship) {
	super(firstName, lastName, gender, age, citizenship);
	this.Passowrd =ran.nextInt(99999999- 0000001) + 00000001 ;
}

@Override
public String toString() {
	return   "\n"+ "Passenger:\n" +  super.toString()
			+" , Passowrd: "+ Passowrd;
}	
	
	@Override
	public void print() 
		{System.out.println(toString());
		}
	
}
