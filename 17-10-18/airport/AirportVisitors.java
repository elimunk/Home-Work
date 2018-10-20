import java.util.Random;

public abstract class AirportVisitors {
	
	Random ran = new Random();

	private String firstName;
	private String lastName; 
	private String gender; 
	private int age;
	private int id;
	private String citizenship;
	private final int passNumber;
	
	public AirportVisitors(String firstName, String lastName, String gender, int age, String citizenship)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.age = (age>=0 && age <=120) ? age : 0 ;
		this.id = ran.nextInt(999999- 00001) + 000001;
		this.citizenship = citizenship;
		this.passNumber =ran.nextInt(99999999- 0000001) + 00000001 ;
	}
	
	@Override
	public String toString() {
		return
	            "First Name: " + firstName + 
				" , LastName: " + lastName + 
				"\nGender: " + gender + 
				" , Age: " + age +
				" , Id: " + id + 
				"\nCitizenship: " + citizenship +
				" , PassNumber: " + passNumber
				;
	}
	
	public abstract void print();	
	
}
