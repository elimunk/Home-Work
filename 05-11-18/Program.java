import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        
		int numOfProductsInSuitcase = (int) (Math.random() * 5 + 5);

		Product[] array = new Product[] { new Product("sucks"), new Product("pens"), new Product("shirts"),
				new Product("medic"), new Product("glasses"), new Product("unglasses"), new Product("ball"),
				new Product("food"), new Product("drink"), new Product("book"), new Product("gloves"),
				new Product("leptop"), new Product("pen"), new Product("shoes"), new Product("boots"),
				new Product("phone"), new Product("toothbrush"), new Product("calculator"), new Product("umbrella"),
				new Product("Purse"), };

		Passenger pass1 = new Passenger(new Suitcase(), (int) (Math.random() * 901 + 100), 
				          (int) (Math.random() * 91 + 10), (int) (Math.random() * 191 + 10));

		for (int i = 0; i < numOfProductsInSuitcase; i++) {
			pass1.getSuitcase().addProductInSuitcase(array[(int) (Math.random() * 18 + 0)]);
		}

		System.out.println(pass1.toString());
		System.out.println("Is passenger over free kg: "+pass1.isOverFreeKg());
		
        if (pass1.isOverFreeKg()) {
	    System.out.println("Do you want to pay for the extra weight?");
}
        String answer=scan.nextLine();
		switch (answer) {
		case "yes":{
			System.out.println("The price of the extra weight is: "+
		    (pass1.getSuitcase().getWeightOfSuitcase()-pass1.getTotalFreeKg())*pass1.getPriceForExtraKg());
			break;
		   }
		
		case "no":{
			System.out.println("You must remove items from the suitcase! You need to remove "+
		(pass1.getSuitcase().getWeightOfSuitcase()-pass1.getTotalFreeKg())+" kg.\n");
			
			while (pass1.getSuitcase().getWeightOfSuitcase()>pass1.getTotalFreeKg()) {
				System.out.println("Please enter each index number for the product you want to remove:");
				for(Product p : pass1.getSuitcase().getProductInSuitcase()) {
					System.out.println(p.getNameOfPruduct()+ " " + p.getWeight()+"kg index: "+
				pass1.getSuitcase().getProductInSuitcase().indexOf(p));
				}
				int scn = scan.nextInt();
				pass1.getSuitcase().getProductInSuitcase().remove(scn);	
		}
			
			System.out.println("Great! your new Suitcase: "+pass1.getSuitcase().toString());
		}
		
	}
		scan.close();
}

}
