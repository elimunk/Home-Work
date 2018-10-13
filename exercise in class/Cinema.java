package cinema;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {

        Scanner scan= new Scanner (System.in);
        Seats[][] seats= new Seats[4][3];
		
		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats[row].length; col++) {
				seats[row][col]=new Seats();
			}
		}

		System.out.println("Please enter sum of tickets do you want:");
		int num= scan.nextInt();
		
        for (int i = 0; i < num; i++) {
        	System.out.println("-Choose your seat no "+ (i+1) + "\nPlease enter row number:");
    		int row=scan.nextInt();
    		System.out.println("Please enter col number:");
    		int col=scan.nextInt();
    		if (seats[row][col].isSeatTaken()){
    			System.out.println("oooooops! this seat is already taken. Please choose difftent seat...");
    			i--;
    		}else {seats[row][col].takeSeat();
    		seats[row][col].setRowAndCol(row, col);
    		}
    		} 
//        >>>> printing all seats data <<<<
        
         System.out.println("--------------------\nYour Tickets :");
        int c=1;
        double total=0;
        for (int row = 0; row < seats.length; row++) {
        	for (int col = 0; col < seats[row].length; col++) {
        		if (seats[row][col].isSeatTaken())
        		{
        		System.out.println("Seat " + c +": row "+ 
        		seats[row][col].getRow()+ " col " + 
        				seats[row][col].getCol() +", Seat price is: "+ 
        		seats[row][col].getPrice()+"$");
                        c++;	
                      total+=  seats[row][col].getPrice();
        		}
		}
	}
        System.out.println("Total : "+ total+ "$\n------------ END---------------");
	}
}
