
public class Program {

	public static void main(String[] args) {

		
		Pilot p = new Pilot("Eli", "Munk", "Male", 25, "Israel", 6);
		FlightAttendant f=new FlightAttendant("Anna", "Munk", "Female", 28, "Israel", "Russia", "Economy");
		GroundAttendant g = new GroundAttendant("Diana", "Rock", "Fmale", 22, "USA", "India", "Desk");
		Passenger pass= new Passenger("Bob", "Alice", "Man", 66, "Italiano");
		
		System.out.println("----------------------------INFORMATIONS---------------------------");

		p.print();
		f.print();
		g.print();
		pass.print();
		
		System.out.println("\n-----------------------------by array------------------------------");

		AirportVisitors[] array= new AirportVisitors[]{p, f, g, pass };
			
			for (int i = 0; i < array.length; i++) {
				array[i].print();
			}
						
	}

}
