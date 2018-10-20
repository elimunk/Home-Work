package pizza;

public class Program {

	public static void main(String[] args) {

		Pizza[] matrix = new Pizza[5];
		
		int totalToppings=0;
		
		matrix[0]= new Pizza(12.5, 6, 0);
		matrix[1]= new Pizza(26, 2, 3);
		matrix[2]= new Pizza(60, 8, 5);
		matrix[3]= new Pizza(24.5, 8, 1);
		matrix[4]= new Pizza(40, 6, 0);
		
		System.out.println("----------Pizzas data----------");
		
			for (int i = 0; i < matrix.length; i++) {
				System.out.println(i+1 + ". Basic Pizza: " + matrix[i].isBasicPizza()+ ". " + matrix[i].toString() ); 
				totalToppings+=matrix[i].getToppings();
			}
			
	   System.out.println("----The total of toppings: " + totalToppings + "----\n             END");
			
	}

}
