
public class GroundAttendant extends AirportVisitors {

	
	String originCountry;
	String job;
	
	public GroundAttendant(String firstName, String lastName, String gender, int age, String citizenship,
			String originCountry, String job) {
		super(firstName, lastName, gender, age, citizenship);
		this.originCountry = originCountry;
		this.job = job;
	}

	
	@Override
	public String toString() {
		return  "\n"+ "Groundn Attendant:\n" +  super.toString()
		+ " , Origin Country: "+ originCountry +" , Job: " + job ;
	}
	
	@Override
	public void print() {
		{System.out.println(toString());
		}
	}

}
