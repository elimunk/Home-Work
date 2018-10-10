import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int numOfSeat=1;
        Scanner scan= new Scanner (System.in);
		Cinema[][] Seats= new Cinema[4][3];
		
		for (int row = 0; row < Seats.length; row++) {
			for (int col = 0; col < Seats[row].length; col++) {
			  Seats[row][col]=new Cinema();
			}
		}
		System.out.println("Please enter sum of tickets do you want:");
		int num= scan.nextInt();
		
		for (int i = 0; i < num; i++) {
			boolean seated= false;
	do	{
		
		System.out.println("Please choose your seat:\nPlease enter row:");
		int selectederw=scan.nextInt();
		System.out.println("Please enter col:");
		int selectedcol=scan.nextInt();
 if(Seats[selectederw][selectedcol].isSeatTaken()==false){
		
			Seats[selectederw][selectedcol].takeSeat();
			seated= true;}
else {
	System.out.println("Please choose difftent seat...");
		} 
	}
	while (seated==false);
	
	}
			
	}

}
