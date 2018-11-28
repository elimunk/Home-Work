import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
pizzas.add(new Pizza(Topping.CORN, Size.LARGE, 12.5));
pizzas.add(new Pizza(Topping.OLIVE, Size.MEDIUM, 15.5));
pizzas.add(new Pizza(Topping.ONION, Size.SMALL, 35.4));

for (Pizza p : pizzas){
	System.out.println(p);
}
}

}
